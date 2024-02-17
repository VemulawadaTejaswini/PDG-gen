public class func{
public void getRealmInternal(){
        Lock l = realmLock.readLock();
            l.lock();
            l.unlock();
}
}
