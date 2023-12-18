import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int Q = sc.nextInt();
			if (N == 0) break;
			StringBuilder sb = new StringBuilder();
			boolean[][] sw = new boolean[Q][N];
			boolean[][] on = new boolean[Q][M];
			for (int i = 0; i < Q; ++i) {
				char[] S = sc.next().toCharArray();
				char[] B = sc.next().toCharArray();
				for (int j = 0; j < N; ++j) {
					sw[i][j] = S[j] == '1';
				}
				for (int j = 0; j < M; ++j) {
					on[i][j] = B[j] == '1';
				}
			}
			for (int i = 1; i < Q; ++i) {
				for (int j = 0; j < N; ++j) {
					sw[i][j] ^= sw[i-1][j];
				}
			}
			for (int i = 0; i < M; ++i) {
				boolean[] ng = new boolean[N];
				for (int j = 0; j < Q; ++j) {
					if (on[j][i]) {
						for (int k = 0; k < N; ++k) {
							if (!sw[j][k]) ng[k] = true;
						}
					} else {
						for (int k = 0; k < N; ++k) {
							if (sw[j][k]) ng[k] = true;
						}
					}
				}
				int res = -1;
				for (int j = 0; j < N; ++j) {
					if (ng[j]) continue;
					res = res == -1 ? j : -2;
				}
				sb.append((char) (res == -2 ? '?' : (res < 10 ? res + '0' : res - 10 + 'A')));
			}
			System.out.println(sb);
		}
	}
}