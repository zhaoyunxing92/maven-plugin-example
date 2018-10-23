/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package com.sunny.maven;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.config.xml.ParserEntityResolver;
import org.mybatis.generator.config.xml.ParserErrorHandler;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyunxing
 * @class: com.sunny.maven.Test
 * @date: 2018-08-17 00:15
 * @des:
 */
public class Test {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.setEntityResolver(new ParserEntityResolver());
        Document document = builder.parse(is);
        // ParserErrorHandler handler = new ParserErrorHandler();
      //  builder.setErrorHandler(handler);

        //        try {
        //            //D:\code\java\ccclubs-ntsp-open-api\src\main\resources\generatorConfig.xml
        //            List<String> warnings = new ArrayList<String>();
        //            boolean overwrite = true;
        //            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        //            InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
        //            String file = "C:/code/java/maven-plugin-example/src/main/resources/generatorConfig.xml";
        //            ConfigurationParser cp = new ConfigurationParser(warnings);
        //            Configuration config = cp.parseConfiguration(is);
        //            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //            myBatisGenerator.generate(null);
        //        } catch (SQLException | IOException | InterruptedException | XMLParserException | InvalidConfigurationException e) {
        //            e.printStackTrace();
        //        }
    }
}
