import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[][] dp = new long[2][N + 1];
		dp[0][0] = 1;
		int t = 1;
		for (int i = 0; i < N; ++i) {
			char v = sc.next().charAt(0);
			if (v == '-') continue;
			Arrays.fill(dp[t], 0);
			if (v == 'D') {
				for (int j = 1; j <= i; ++j) {
					dp[t][j] += dp[1 - t][j] * j % MOD;
					dp[t][j - 1] += dp[1 - t][j] * j * j % MOD;
				}
			} else {
				for (int j = 0; j <= i; ++j) {
					dp[t][j + 1] += dp[1 - t][j];
					dp[t][j] += dp[1 - t][j] * j % MOD;
				}
			}
			t = 1 - t;
		}
		System.out.println(dp[1 - t][0] % MOD);
	}
}