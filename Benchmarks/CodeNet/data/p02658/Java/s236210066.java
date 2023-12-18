import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long r = 1L;
        boolean existZero = false;
        boolean overThres = false;
        final long thres = 1000000000000000000L;
        for(int i=1; i<=N; i++) {
            long tmp = sc.nextLong();
            if(existZero) continue;
            if(tmp==0L) {
                existZero = true;
                continue;
            }
            r = r * tmp;
            if(r> thres || r < 0) {
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
        System.out.println(r);
    }
}
