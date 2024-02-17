public class dummy {
    public static Checksum checksum(File file, Checksum checksum) throws IOException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        InputStream in = null;
        try {
            in = new CheckedInputStream(new FileInputStream(file), checksum);
            IOUtils.copy(in, new OutputStream() {
                public void write(byte[] b, int off, int len) {
                }
                public void write(int b) {
                }
                public void write(byte[] b) throws IOException {
                }
            });
        } finally {
            IOUtils.closeQuietly(in);
        }
        return checksum;
    }
}
