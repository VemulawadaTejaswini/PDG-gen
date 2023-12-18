import java.util.*;
public class Main {
    static final long MOD = (1000000000L+7L);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long r = 0L;
        for(long t=K; t<=N+1; t++) {
            long tmp = t*N-t*(t-1)+1;
//            System.out.println(String.format("t=%d, tmp=%d", t, tmp));
            r=(r + tmp) % MOD;
        }
        System.out.println(r);
    }
}
