import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();

		int[][] X = new int[N + 1][N + 1];

		for(int i = 0; i < M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			X[l][r]++;
		}

		int[][] C = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[i][j] = X[i][j] + C[i][j - 1];
			}
		}

		for(int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			int sum = 0;
			for(int j = p; j <= q; j++) {
				sum += C[j][q] - C[j][p - 1];
			}

			System.out.println(sum);
		}
	}
}