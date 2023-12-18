import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		String X, Y;

		for (int i = 0; i < n; i++) {
			X = sc.nextLine();
			Y = sc.nextLine();

			System.out.println(getLcs(X, Y));
		}

		sc.close();
	}

	private static int getLcs(String X, String Y) {
		int m = X.length();
		int n = Y.length();

		char[] x = X.toCharArray();
		char[] y = Y.toCharArray();

		int[][] dp = new int[m + 1][n + 1];

		int max = 0;

		for (int i = 0; i < m + 1; i++) {
			dp[i][0] = 0;
		}

		for (int j = 1; j < n + 1; j++) {
			dp[0][j] = 0;
		}

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (x[i -1] == y[j -1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
				max = Math.max(max, dp[i][j]);
			}
		}

		return max;

	}

}

