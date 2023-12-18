import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String g;
	static String[] a, b;
	static final int INF = 999;
	static int N, M, A, B, C, T;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			T = sc.nextInt();
			int[] ans = solve();
			for (int i = 0; i < N; ++i) {
				if (i != 0) System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}
	}

	static int[] solve() {
		int[] v = new int[N];
		for (int i = 0; i < N; ++i) {
			v[i] = sc.nextInt();
		}
		int[][][] cnt = new int[30][N + 2][N + 2];
		for (int i = 1; i <= N; ++i) {
			cnt[0][i][i - 1] = C;
			cnt[0][i][i] = B;
			cnt[0][i][i + 1] = A;
		}
		for (int i = 1; (1 << i) <= T; ++i) {
			for (int j = 1; j <= N; ++j) {
				for (int k = 1; k <= N; ++k) {
					for (int l = 1; l <= N; ++l) {
						cnt[i][j][k] += cnt[i - 1][j][l] * cnt[i - 1][l][k];
					}
					cnt[i][j][k] %= M;
				}
			}
		}
		int[][] c = new int[2][N + 2];
		for (int i = 1; i <= N; ++i) {
			c[0][i] = v[i - 1];
		}
		int t = 0;
		for (int i = 0; (1 << i) <= T; ++i) {
			if ((T & (1 << i)) != 0) {
				for (int j = 1; j <= N; ++j) {
					c[1 - t][j] = 0;
				}
				for (int j = 1; j <= N; ++j) {
					for (int k = 1; k <= N; ++k) {
						c[1 - t][k] += c[t][j] * cnt[i][j][k];
					}
				}
				for (int j = 1; j <= N; ++j) {
					c[1 - t][j] %= M;
				}
				t = 1 - t;
			}
		}
		for (int i = 0; i < N; ++i) {
			v[i] = c[t][i + 1];
		}
		return v;
	}
}