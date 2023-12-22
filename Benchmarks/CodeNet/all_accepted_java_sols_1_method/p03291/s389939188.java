import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int mod = 1000000007;
		int n = s.length;
		long[][] dp = new long[n + 1][3];
		long b = 1;
		for (int i = 0; i < n; i++) {
			if (s[i] == 'A') {
				dp[i + 1][0] = dp[i][0] + b;
				dp[i + 1][0] %= mod;
				dp[i + 1][1] = dp[i][1];
				dp[i + 1][2] = dp[i][2];

			} else if (s[i] == 'B') {
				dp[i + 1][0] = dp[i][0];
				dp[i + 1][1] = dp[i][0] + dp[i][1];
				dp[i + 1][1] %= mod;
				dp[i + 1][2] = dp[i][2];

			} else if (s[i] == 'C') {
				dp[i + 1][0] = dp[i][0];
				dp[i + 1][1] = dp[i][1];
				dp[i + 1][2] = dp[i][1] + dp[i][2];
				dp[i + 1][2] %= mod;

			} else {
				dp[i + 1][0] = dp[i][0] * 3 + b;
				dp[i + 1][0] %= mod;
				dp[i + 1][1] = dp[i][0] + dp[i][1] * 3;
				dp[i + 1][1] %= mod;
				dp[i + 1][2] = dp[i][1] + dp[i][2] * 3;
				dp[i + 1][2] %= mod;
				b = b * 3 % mod;
			}
		}
		System.out.println(dp[n][2]);
	}
}
