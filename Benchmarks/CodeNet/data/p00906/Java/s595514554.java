import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				sc.close();
				break;
			}
			int M = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int T = sc.nextInt();

			// 行列をつくる
			// matrix[n]にはmatrixを2^n乗した行列が入ってる
			int[][][] matrix = new int[30][N + 2][N + 2];
			for (int i = 1; i <= N; ++i) {
				matrix[0][i][i - 1] = C;
				matrix[0][i][i] = B;
				matrix[0][i][i + 1] = A;
			}

			for (int n = 1; (1 << n) <= T; ++n) {
				for (int i = 1; i <= N; ++i) {
					for (int j = 1; j <= N; ++j) {
						for (int l = 1; l <= N; ++l) {
							matrix[n][i][j] += matrix[n - 1][i][l] * matrix[n - 1][l][j];
						}
						matrix[n][i][j] %= M;
					}
				}
			}

			int[][] c = new int[2][N + 2];
			for (int i = 1; i <= N; ++i) {
				c[0][i] = sc.nextInt();
			}

			int t = 0;
			for (int i = 0; (1 << i) <= T; ++i) {
				if ((T & (1 << i)) != 0) {
					for (int j = 1; j <= N; ++j) {
						c[1 - t][j] = 0;
					}
					for (int j = 1; j <= N; ++j) {
						for (int k = 1; k <= N; ++k) {
							c[1 - t][k] += c[t][j] * matrix[i][j][k];
						}
					}
					for (int j = 1; j <= N; ++j) {
						c[1 - t][j] %= M;
					}
					t = 1 - t;
				}
			}

			for (int i = 0; i < N; ++i) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(c[t][i + 1]);
			}
			System.out.println();
		}
	}
}