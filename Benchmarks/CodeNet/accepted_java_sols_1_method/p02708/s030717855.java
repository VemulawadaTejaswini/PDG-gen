import java.util.*;


public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] sum = new long[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1]+i;
            sum[i] %= MOD;
        }
        long ans = 0;
        for (int i = K; i <= N; i++) {
            long max = sum[N]-sum[N-i];
            if (max < 0) max += MOD;
            long min = sum[i-1];
            long tmp = max-min;
            if (tmp < 0) tmp += MOD;
            tmp += 1;
            tmp %= MOD;

            ans += tmp;
            ans %= MOD;
        }

        ans++;
        ans %= MOD;

        System.out.println(ans);
    }
}
