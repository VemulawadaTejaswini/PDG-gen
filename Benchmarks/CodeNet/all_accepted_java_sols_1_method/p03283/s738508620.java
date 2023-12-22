import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		int[][] C = new int[N + 1][N + 1];

		for(int i = 0; i < M; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			C[l][r]++;
		}

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[i][j] += C[i][j - 1];
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[i][j] += C[i - 1][j];
			}
		}

		for(int i = 0; i < Q; i++) {
			int p = Integer.parseInt(sc.next());
			int q = Integer.parseInt(sc.next());
			System.out.println(C[q][q] - C[p - 1][q] - C[p][p - 1] + C[p - 1][p - 1]);
		}
	}
}