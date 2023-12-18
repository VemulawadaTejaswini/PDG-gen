import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            sum += v[i];
        }

        long[] dp = new long[sum + 1];
        long INF = (long)1e18;
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = sum; j >= v[i]; j--) {
                dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
            }
        }
        long res = 0;
        for (int j = 0; j <= sum; j++) {
            if (dp[j] <= W) {
                res = Math.max(res, j);
            }
        }
        System.out.println(res);
    }
}