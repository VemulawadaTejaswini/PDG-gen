public class dummy {
    protected Document fetchResource(String method, String parameter, Locale locale, final FloodLimit limit) throws IOException, SAXException {
        return getDocument(new CachedPage(getResourceLocation(method, parameter, locale)) {
            protected Reader openConnection(URL url) throws IOException {
                try {
                    if (limit != null) {
                        limit.acquirePermit();
                    }
                    return super.openConnection(url);
                } catch (InterruptedException e) {
                    throw new IOException(e);
                }
            }
            ;
        }.get());
    }
}
