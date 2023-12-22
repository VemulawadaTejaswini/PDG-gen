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
            long new_r = r * tmp;
            if(new_r> thres || new_r < 0 || new_r < r || new_r < tmp) {
                overThres = true;
            }
            r = new_r;
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
