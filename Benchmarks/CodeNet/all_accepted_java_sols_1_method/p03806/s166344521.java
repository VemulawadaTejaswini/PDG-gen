import java.util.*;

class Main {
	static int N, Ma, Mb;
	static int[] a, b, c;
	static int[][][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Ma = sc.nextInt();
		Mb = sc.nextInt();
		a = new int[N];
		b = new int[N];
		c = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		dp = new int[N][401][401];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j <= 400; ++j) {
				for (int k = 0; k <= 400; ++k) {
					dp[i][j][k] = Integer.MAX_VALUE / 16;
				}
			}
		}
		dp[0][0][0] = 0;
		dp[0][a[0]][b[0]] = c[0];
		for (int i = 1; i < N; ++i) {
			for (int j = 0; j <= 400; ++j) {
				for (int k = 0; k <= 400; ++k) {
					dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j][k]);
					if (j + a[i] > 400 || k + b[i] > 400 || dp[i - 1][j][k] >= Integer.MAX_VALUE / 16)
						continue;
					dp[i][j + a[i]][k + b[i]] = Math.min(dp[i][j + a[i]][k + b[i]], dp[i - 1][j][k] + c[i]);
				}
			}
		}
		long ans = Integer.MAX_VALUE / 16;
		for (int i = 1; i <= 400; ++i) {
			for (int j = 1; j <= 400; ++j) {
				if (dp[N - 1][i][j] >= Integer.MAX_VALUE / 16)
					continue;
				if (i * Mb == j * Ma) {
					ans = Math.min(ans, dp[N - 1][i][j]);
				}
			}
		}
		System.out.println((ans < Integer.MAX_VALUE / 16) ? ans : -1);
	}
}