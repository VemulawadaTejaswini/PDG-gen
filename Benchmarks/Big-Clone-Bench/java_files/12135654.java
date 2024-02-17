public class dummy {
                protected URLConnection openConnection(URL url) throws IOException {
                    return new URLConnection(url) {
                        public void connect() throws IOException {
                        }
                        public InputStream getInputStream() throws IOException {
                            ThemeResource f = getFacelet(getURL().getFile());
                            return new ByteArrayInputStream(f.getText().getBytes());
                        }
                    };
                }
}
