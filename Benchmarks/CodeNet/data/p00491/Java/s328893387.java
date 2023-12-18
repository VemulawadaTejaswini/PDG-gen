import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int MOD = 10000;
	static int dp[][][][];
	static int n, k;
	static int day[];

	public static int dp(int p1, int p2, int p3, int d) {
		if (0 <= dp[p1][p2][p3][d]) {
			return dp[p1][p2][p3][d];
		}
		if (p1 == p2 && p2 == p3) {
			return dp[p1][p2][p3][d] = 0;
		}

		if (d <= 2) {
			return dp[p1][p2][p3][d] = 1;
		} else {
			int count = 0;
			if (day[d - 3] == -1) {
				for (int i = 0; i < 3; i++) {
					count += dp(i, p1, p2, d - 1);
					count %= MOD;
				}
			} else {
				count += dp(day[d - 3], p1, p2, d - 1);
				count %= MOD;
			}
			return dp[p1][p2][p3][d] = count;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();
		day = new int[n];
		Arrays.fill(day, -1);
		for (int i = 0; i < k; i++) {
			day[sc.nextInt() - 1] = sc.nextInt() - 1;
		}

		dp = new int[3][3][3][n];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int l = 0; l < 3; l++) {
					Arrays.fill(dp[i][j][l], -1);
				}
			}
		}

		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (day[n - 3] == -1 || day[n - 3] == i) {
				for (int j = 0; j < 3; j++) {
					if (day[n - 2] == -1 || day[n - 2] == j) {
						for (int l = 0; l < 3; l++) {
							if (day[n - 1] == -1 || day[n - 1] == l) {
								count += dp(i, j, l, n - 1);
								count %= MOD;
							}
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}