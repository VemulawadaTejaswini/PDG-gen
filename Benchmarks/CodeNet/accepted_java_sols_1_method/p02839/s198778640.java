import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = Math.abs(a[i][j] - sc.nextInt());
			}
		}

		boolean[][][] dp = new boolean[h][w][6481];
		dp[0][0][a[0][0]] = true;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == 0 && j == 0) continue;

				for (int k = 0; k < 6481; k++) {
					if (i > 0 && dp[i - 1][j][k]) {
						dp[i][j][Math.abs(k - a[i][j])] = true;
						if (k + a[i][j] < 6481) dp[i][j][k + a[i][j]] = true;
					}

					if (j > 0 && dp[i][j - 1][k]) {
						dp[i][j][Math.abs(k - a[i][j])] = true;
						if (k + a[i][j] < 6481) dp[i][j][k + a[i][j]] = true;
					}

				}

			}
		}

		for (int i = 0; i < 6481; i++) {
			if (dp[h - 1][w - 1][i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
