import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int length = arr.length;
        long[][] dp = new long[length + 1][2];
        dp[0][1] = 1;
        for (int i = 1; i <= length; i++) {
            dp[i][0] += dp[i - 1][0] * 3;
            dp[i][0] %= MOD;
            if (arr[i - 1] == '1') {
                dp[i][1] += dp[i - 1][1] * 2;
                dp[i][1] %= MOD;
                dp[i][0] += dp[i - 1][1];
                dp[i][0] %= MOD;
            } else {
                dp[i][1] += dp[i - 1][1];
            }
        }
        System.out.println((dp[length][0] + dp[length][1]) % MOD);
    }
}