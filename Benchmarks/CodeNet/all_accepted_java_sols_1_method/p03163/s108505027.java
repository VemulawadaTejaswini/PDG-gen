import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[][] a = new int[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		long[][] dp = new long[N + 1][W + 1];
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < W + 1; j++) {
				dp[i][j] = (int)Double.NEGATIVE_INFINITY;
			}
		}
		dp[0][0] = 0;

		for (int i = 0; i < N; i++) {
			int weight = a[i][0];
			int value = a[i][1];

			for (int j = 0; j < W + 1; j++) {
				if (dp[i][j] >= 0) {
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);

					if (j + weight <= W) {
						dp[i + 1][j + weight] = Math.max(dp[i + 1][j + weight], dp[i][j] + value);
					}
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < W + 1; i++) {
			ans = Math.max(ans, dp[N][i]);
		}

		System.out.println(ans);
	}

}
