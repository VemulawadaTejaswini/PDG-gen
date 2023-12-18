import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M, R;
	static int[] x, y, z, r;
	static long[] l;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0) break;
			System.out.println(solve());
		}
	}

	static int solve() {
		final int INF = 1 << 28;
		int[][] dl = new int[N][N];
		int[][] ds = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				dl[i][j] = ds[i][j] = INF;
			}
			dl[i][i] = ds[i][i] = 0;
		}
		for (int i = 0; i < M; ++i) {
			int X = Integer.parseInt(sc.next()) - 1;
			int Y = Integer.parseInt(sc.next()) - 1;
			int T = Integer.parseInt(sc.next());
			boolean land = sc.next().charAt(0) == 'L';
			if (land) {
				dl[X][Y] = dl[Y][X] = Math.min(dl[X][Y], T);
			} else {
				ds[X][Y] = ds[Y][X] = Math.min(ds[X][Y], T);
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = 0; k < N; ++k) {
					dl[j][k] = Math.min(dl[j][k], dl[j][i] + dl[i][k]);
					ds[j][k] = Math.min(ds[j][k], ds[j][i] + ds[i][k]);
				}
			}
		}
		R = sc.nextInt();
		int PZ = sc.nextInt() - 1;
		int[][] dp = new int[2][N];
		Arrays.fill(dp[0], INF);
		Arrays.fill(dp[1], INF);
		dp[0][PZ] = 0;
		int t = 1;
		for (int i = 1; i < R; ++i) {
			int Z = sc.nextInt() - 1;
			Arrays.fill(dp[t], INF);
			for (int j = 0; j < N; ++j) {
				if (dp[t ^ 1][j] == INF) continue;
				for (int k = 0; k < N; ++k) {
					dp[t][k] = Math.min(dp[t][k], dp[t ^ 1][j] + dl[PZ][j] + ds[j][k] + dl[k][Z]);
				}
				dp[t][j] = Math.min(dp[t][j], dp[t ^ 1][j] + dl[PZ][Z]);
			}
			t ^= 1;
			PZ = Z;
		}
		int ans = INF;
		for (int i = 0; i < N; ++i) {
			ans = Math.min(ans, dp[t ^ 1][i]);
		}
		return ans;
	}

}