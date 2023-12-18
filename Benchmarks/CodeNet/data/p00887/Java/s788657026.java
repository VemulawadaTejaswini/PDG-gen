import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M, D;

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();
			D = sc.nextInt();
			if (M == 0) break;
			System.out.println(solve() ? 1 : 0);
		}
	}

	static boolean solve() {
		int[][] mat = new int[M * N][M * N + 1];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				mat[i * M + j][M * N] = sc.nextInt();
				mat[i * M + j][i * M + j] = 1;
				for (int k = -D; k <= D; ++k) {
					if (j + k < 0 || M <= j + k) continue;
					int dy = D - Math.abs(k);
					if (i - dy >= 0) {
						mat[i * M + j][(i - dy) * M + j + k] = 1;
					}
					if (i + dy < N) {
						mat[i * M + j][(i + dy) * M + j + k] = 1;
					}
				}
			}
		}
		boolean[] used = new boolean[N * M];
		for (int i = 0; i < N * M; ++i) {
			int pivot = -1;
			for (int j = 0; j < N * M; ++j) {
				if (used[j]) continue;
				if (mat[j][i] == 1) {
					pivot = j;
					break;
				}
			}
			if (pivot == -1) continue;
			used[pivot] = true;
			for (int j = 0; j < N * M; ++j) {
				if (j == pivot || mat[j][i] == 0) continue;
				for (int k = 0; k <= N * M; ++k) {
					mat[j][k] += mat[pivot][k];
					if (mat[j][k] == 2) mat[j][k] = 0;
				}
			}
		}
		for (int i = 0; i < N * M; ++i) {
			if (mat[i][N * M] == 0) continue;
			boolean ok = false;
			for (int j = 0; j < N * M; ++j) {
				if (mat[i][j] != 0) ok = true;
			}
			if (!ok) return false;
		}
		return true;
	}

}