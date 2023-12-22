import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(), w = s.nextInt();

		int[][] item = new int[n + 1][2];

		for (int i = 1; i <= n; i++) {
			item[i][0] = s.nextInt();// ??????

			item[i][1] = s.nextInt();// ??????
		}

		int[][] dp = new int[n + 1][w + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i <= w; i++) {
			dp[0][i] = 0;

		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				if (item[i][1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - item[i][1]] + item[i][0]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= w; i++) {
			ans = Math.max(ans, dp[n][i]);
		}
		System.out.println(ans);
	}
}