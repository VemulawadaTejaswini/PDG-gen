import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger bi = BigInteger.ONE;
        int n = sc.nextInt();
        Long ans = 1L;
        Long jdk = (long)1e18;
        
        for(int i = 0;i < n;i++){
            long a = sc.nextLong();
            bi = bi.multiply(BigInteger.valueOf(a));
        }
        System.out.println(bi.longValue() <= jdk && bi.longValue() >= 1? bi.longValue() : -1);
    }
}
