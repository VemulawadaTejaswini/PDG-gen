public class dummy {
    private MapProperties readProperties(URL url) {
        InputStream is = null;
        try {
            is = url.openStream();
            properties.load(is);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            StreamUtils.close(is);
        }
        return properties;
    }
}
