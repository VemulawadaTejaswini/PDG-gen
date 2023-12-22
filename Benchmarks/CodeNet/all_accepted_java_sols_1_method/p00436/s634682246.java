import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] v = new int[2][2 * N];
		for (int i = 0; i < 2 * N; ++i) {
			v[0][i] = i + 1;
		}
		int p = 1;
		for (int i = 0; i < M; ++i) {
			int q = sc.nextInt();
			if (q == 0) {
				for (int j = 0; j < N; ++j) {
					v[p][2 * j] = v[1 - p][j];
					v[p][2 * j + 1] = v[1 - p][N + j];
				}
			} else {
				for (int j = 0; j < 2 * N - q; ++j) {
					v[p][j] = v[1 - p][j + q];
				}
				for (int j = 0; j < q; ++j) {
					v[p][2 * N - q + j] = v[1 - p][j];
				}
			}
			p = 1 - p;
		}
		for (int i = 0; i < 2 * N; ++i) {
			System.out.println(v[1 - p][i]);
		}
	}
}