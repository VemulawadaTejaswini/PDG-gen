import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        BigInteger r = new BigInteger("1");
        boolean existZero = false;
        boolean overThres = false;
        final BigInteger thres = new BigInteger("1000000000000000000");
        for(int i=1; i<=N; i++) {
            String AA = sc.next();
            if(existZero) continue;
            BigInteger tmp = new BigInteger(AA);
            if(tmp.equals(BigInteger.ZERO)) {
                existZero = true;
                continue;
            }
            r = r.multiply(tmp);
            if(r.compareTo(thres)> 0) {
                overThres = true;
            }
        }
        if(existZero) {
            System.out.println(0);
            return;
        }
        if(overThres) {
            System.out.println(-1);
            return;
        }
        System.out.println(r.toString());
    }
}
