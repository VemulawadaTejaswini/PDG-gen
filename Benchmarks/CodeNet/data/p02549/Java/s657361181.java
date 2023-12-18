import java.util.*;

public class Main {

    private static long getSum(int l, int r, long[] sum) {
        long ans = r >= 0 ? sum[r] : 0;
        ans -= l >= 0 ? sum[l] : 0;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long mod = 998244353L;
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < k; i++) {
            l[i] = scan.nextInt();
            r[i] = scan.nextInt();
        }
        long[] sum = new long[n];
        long[] dp = new long[n];
        sum[0] = dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i] = (dp[i] + getSum(i - r[j] - 1, i - l[j], sum)) % mod;
            }
            sum[i] = sum[i - 1] + dp[i];
        }
        System.out.println(dp[n - 1]);
    }
}
