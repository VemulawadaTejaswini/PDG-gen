import java.util.BitSet;
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
		BitSet[] mat = new BitSet[M * N];
		for (int i = 0; i < N * M; ++i) {
			mat[i] = new BitSet(N * M + 1);
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				if (sc.nextInt() == 1) mat[i * M + j].set(M * N);
				mat[i * M + j].set(i * M + j);
				for (int k = -D; k <= D; ++k) {
					if (j + k < 0 || M <= j + k) continue;
					int dy = D - Math.abs(k);
					if (i - dy >= 0) mat[i * M + j].set((i - dy) * M + j + k);
					if (i + dy < N) mat[i * M + j].set((i + dy) * M + j + k);
				}
			}
		}
		boolean[] used = new boolean[N * M];
		for (int i = 0; i < N * M; ++i) {
			int pivot = -1;
			for (int j = 0; j < N * M; ++j) {
				if (used[j]) continue;
				if (mat[j].get(i)) {
					pivot = j;
					break;
				}
			}
			if (pivot == -1) continue;
			used[pivot] = true;
			for (int j = 0; j < N * M; ++j) {
				if (j == pivot || !mat[j].get(i)) continue;
				mat[j].xor(mat[pivot]);
			}
		}
		for (int i = 0; i < N * M; ++i) {
			if (!mat[i].get(N * M)) continue;
			mat[i].clear(N * M);
			if (mat[i].isEmpty()) return false;
		}
		return true;
	}

}