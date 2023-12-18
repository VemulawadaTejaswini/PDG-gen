import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int mod = 100000;
	static int dp[][][];
	static int n, m, s;

	public static int dp(int k, int v, int t) {
		if (0 <= dp[k][v][t]) {
			return dp[k][v][t];
		}
		if (k == n * n - 1) {
			if (v == t) {
				return dp[k][v][t] = 1;
			} else {
				return dp[k][v][t] = 0;
			}
		}
		if (t < v) {
			return dp[k][v][t] = 0;
		}

		int sum = 0;
		for (int i = v + 1; i <= m; i++) {
			sum += dp(k + 1, i, t - v);
			sum %= mod;
		}

		return dp[k][v][t] = sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			if ((n | m | s) == 0) {
				break;
			}

			dp = new int[n * n][m + 1][s + 1];
			for (int i = 0; i < n * n; i++) {
				for (int j = 0; j < m + 1; j++) {
					Arrays.fill(dp[i][j], -1);
				}
			}
			int sum = 0;
			for (int i = 1; i <= m; i++) {
				sum += dp(0, i, s);
				sum %= mod;
			}

			System.out.println(sum);
		}
	}
}