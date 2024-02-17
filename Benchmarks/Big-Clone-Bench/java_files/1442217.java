public class dummy {
    protected URLConnection openConnection(URL url) throws IOException {
        final String urlPath = url.getPath();
        final int status;
        final String path;
        String statusAsString = extractValue(urlPath, STATUS_REGEX, STATUS_CAPTURE);
        status = statusAsString == null ? 200 : Integer.parseInt(statusAsString);
        path = extractPath(urlPath);
        if (saved.get(url.toString()) == null) {
            saved.put(url.toString(), new ArrayList<ByteArrayOutputStream>());
        }
        return new HttpsURLConnection(url) {
            public int getResponseCode() throws IOException {
                return status;
            }
            public InputStream getInputStream() throws IOException {
                if (errorStatus()) throw new IOException("fake server returned a fake error");
                if (path == null) {
                    return new ByteArrayInputStream(new byte[0]);
                } else {
                    return new FileInputStream(path);
                }
            }
            public InputStream getErrorStream() {
                if (errorStatus()) {
                    try {
                        return new FileInputStream(path);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    return null;
                }
            }
            public OutputStream getOutputStream() throws IOException {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                Handler.saved.get(url.toString()).add(out);
                return out;
            }
            public String getContentType() {
                return "test/plain";
            }
            public void connect() throws IOException {
            }
            public boolean usingProxy() {
                return false;
            }
            public void disconnect() {
            }
            private boolean errorStatus() {
                return status >= 500 && status <= 599;
            }
            public String getCipherSuite() {
                return null;
            }
            public Certificate[] getLocalCertificates() {
                return null;
            }
            public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
                return null;
            }
        };
    }
}
