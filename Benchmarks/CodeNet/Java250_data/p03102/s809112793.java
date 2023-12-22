import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());

		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(sc.next());
		}
		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(sc.next());
			}
		}

		long ans = solve(N, M, C, B, A);
		System.out.println(ans);
	}

	private static long solve(int n, int m, int c, int[] b, int[][] a) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int tmp = c;
			for (int j = 0; j < m; j++) {
				tmp += a[i][j] * b[j];
			}

			// System.err.printf("A%s SUM%s\n", i,tmp);
			if (tmp > 0) {
				ans++;
			}
		}
		return ans;
	}
}
