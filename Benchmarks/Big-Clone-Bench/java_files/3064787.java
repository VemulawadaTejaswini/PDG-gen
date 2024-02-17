public class dummy {
    public CacheServiceFactoryImpl() {
        InputStream is;
        try {
            is = url.openStream();
            cacheManager = CacheManager.create(is);
        } catch (IOException ex) {
            System.err.println("NOn riesco ad aprire il file di configurazione ehcache.xml");
        }
    }
}
