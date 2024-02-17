public class dummy {
        public HttpResponse execute() throws IOException {
            return new HttpResponse() {
                public int getResponseCode() throws IOException {
                    return conn.getResponseCode();
                }
                public InputStream getContentStream() throws IOException {
                    InputStream errStream = conn.getErrorStream();
                    if (errStream != null) return errStream; else return conn.getInputStream();
                }
            };
        }
}
