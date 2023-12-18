import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			int MOD = 100000;
			if (W == 0) break;
			int[][][][] dp = new int[H + 1][W + 1][2][2];
			dp[0][0][0][1] = dp[0][0][1][1] = 1;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					dp[i + 1][j][0][0] += dp[i][j][0][0] + dp[i][j][0][1];
					dp[i + 1][j][0][0] %= MOD;
					dp[i][j + 1][1][0] += dp[i][j][1][0] + dp[i][j][1][1];
					dp[i][j + 1][0][0] %= MOD;
					dp[i + 1][j][0][1] += dp[i][j][1][0];
					dp[i + 1][j][0][1] %= MOD;
					dp[i][j + 1][1][1] += dp[i][j][0][0];
					dp[i][j + 1][1][1] %= MOD;
				}
			}
			int ans = 0;
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 2; ++j) {
					ans += dp[H - 1][W - 1][i][j];
				}
			}
			System.out.println(ans % MOD);
		}
	}
}