import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 25/05/20
 */
public class Main {
    static int A, B, C, D;
    static Map<Long, Long> memo = new HashMap<>();
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {

                long N = s.nextLong();
                A = s.nextInt();
                B = s.nextInt();
                C = s.nextInt();
                D = s.nextInt();

                System.out.println(minCoinsReq(N));

            }

        } catch (Exception e) {

        }
    }

    public static long minCoinsReq(long N) {

        if (N == 0) return 0;

        if (N == 1) return D;

        Long cached = memo.get(N);
        if (cached != null) {
            return cached;
        }

        long l2 = N/2*2;
        long r2 = (N+1)/2*2;

        long l3 = N/3*3;
        long r3 = (N+2)/3*3;

        long l5 = N/5*5;
        long r5 = (N+4)/5*5;

        long min = 1_000_000_000_000_000_000L;
        if (N < min) min = N*D;

        min = Math.min(min, Math.abs(l2-N)*D+A+minCoinsReq(l2/2));
        min = Math.min(min, Math.abs(r2-N)*D+A+minCoinsReq(r2/2));
        min = Math.min(min, Math.abs(l3-N)*D+B+minCoinsReq(l3/3));
        min = Math.min(min, Math.abs(r3-N)*D+B+minCoinsReq(r3/3));
        min = Math.min(min, Math.abs(l5-N)*D+C+minCoinsReq(l5/5));
        min = Math.min(min, Math.abs(r5-N)*D+C+minCoinsReq(r5/5));

        memo.put(N, min);
        return min;

    }
}