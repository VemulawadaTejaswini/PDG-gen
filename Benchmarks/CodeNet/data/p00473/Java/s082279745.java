import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int INF = 100000000;
		int N = sc.nextInt();
		int[][][] dp = new int[2][2][N + 1];
		for (int i = 0; i <= N; ++i) {
			dp[0][0][i] = dp[0][1][i] = dp[1][0][i] = dp[1][1][i] = INF;
		}
		dp[0][0][1] = 0;
		int t = 1;
		for (int i = 0; i < N - 1; ++i) {
			int C = sc.nextInt();
			for (int j = 0; j <= N; ++j) {
				dp[t][0][j] = dp[t][1][j] = INF;
			}
			for (int j = 0; j <= 1; ++j) {
				for (int k = 0; k <= Math.min(i + 1, N / 2); ++k) {
					if (dp[1 - t][j][k] == INF) continue;
					dp[t][j][k + 1] = Math.min(dp[t][j][k + 1], dp[1 - t][j][k]);
					dp[t][1 - j][i + 2 - k] = Math.min(dp[t][1 - j][i + 2 - k], dp[1 - t][j][k] + C);
				}
			}
			t = 1 - t;
		}
		System.out.println(Math.min(dp[1 - t][0][N / 2], dp[1 - t][1][N / 2]));
	}
}