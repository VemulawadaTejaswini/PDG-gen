import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int land[][] = new int[n + 1][n + 1];
			int sea[][] = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++) {
				Arrays.fill(land[i], INF);
				Arrays.fill(sea[i], INF);
				land[i][i] = sea[i][i] = 0;
			}
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int t = sc.nextInt();
				String sl = sc.next();
				if (sl.equals("L")) {
					land[x][y] = land[y][x] = Math.min(t, land[x][y]);
				} else {
					sea[x][y] = sea[y][x] = Math.min(t, sea[x][y]);
				}
			}
			for (int k = 1; k <= n; k++) {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						land[i][j] = Math.min(land[i][j], land[i][k]
								+ land[k][j]);
						sea[i][j] = Math.min(sea[i][j], sea[i][k] + sea[k][j]);
					}
				}
			}
			int r = sc.nextInt();
			int[] zs = new int[r];
			for (int i = 0; i < r; i++) {
				zs[i] = sc.nextInt();
			}
			int[][] dp = new int[r][n + 1]; // dp[i][j]
											// i番目までの配達を終え、船がjにあるときの最短時間。
			for (int i = 0; i < r; i++) {
				Arrays.fill(dp[i], INF);
			}
			dp[0][zs[0]] = 0;
			for (int i = 1; i < r; i++) {
				for (int j = 1; j <= n; j++) {
					for (int k = 1; k <= n; k++) {
						dp[i][j] = Math.min(dp[i][j], dp[i - 1][k]
								+ land[zs[i - 1]][k] + sea[k][j]
								+ land[j][zs[i]]);
					}
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]
							+ land[zs[i - 1]][zs[i]]);
				}
			}
			int ans = INF;
			for (int i = 1; i <= n; i++) {
				ans = Math.min(dp[r - 1][i], ans);
			}
			System.out.println(ans);
		}
	}
}