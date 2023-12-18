import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
    
        BigInteger bn = BigInteger.valueOf(n);
        BigInteger ba = BigInteger.valueOf(n);
        long ans = 0L;
        for(int i = 0; i < 100000; i++){
            long low = 0L;
            long high = 1000000000000000000L;
    
            while(high - low > 1){
                long mid = (low + high) / 2;
                if(ok(mid, ba)){
                    high = mid;
                }else{
                    low = mid;
                }
            }
            BigInteger x = BigInteger.valueOf(high);
            if(x.multiply(x.add(BigInteger.ONE)).divide(BigInteger.TWO).remainder(ba).equals(BigInteger.ZERO)){
                ans = high;
                break;
            }
            ba = ba.add(bn);
        }
        System.out.println(ans);
    }
    
    static boolean ok(long mid, BigInteger ba){
    
        BigInteger x = BigInteger.valueOf(mid);
        return x.multiply(x.add(BigInteger.ONE)).divide(BigInteger.TWO).compareTo(ba) >= 0;
    }
}