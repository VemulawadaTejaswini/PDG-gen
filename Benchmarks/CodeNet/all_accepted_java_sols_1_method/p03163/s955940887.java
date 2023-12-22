import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		int[][] table = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				table[i][j] = Integer.parseInt(sc.next());
			}
		}

		long[][] dp = new long[n][w + 1];
		for (int i = table[0][0]; i <= w; i++) {
			dp[0][i] = table[0][1];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= w; j++) {
				if (table[i][0] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - table[i][0]] + table[i][1]);
				}
			}
		}

		System.out.println(dp[n - 1][w]);

		sc.close();
	}

}
