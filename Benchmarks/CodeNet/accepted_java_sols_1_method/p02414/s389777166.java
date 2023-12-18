import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		long[][] A = new long[N][M];
		long[][] B = new long[M][L];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextLong();
			}
		}
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < L; j++) {
				B[i][j] = sc.nextLong();
			}
		}

		// 行列の掛け算
		long[][] C = new long[N][L];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < L; j++) {
				for(int k = 0; k < M; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		for(int i = 0; i < N; i++) {
			System.out.print(C[i][0]);
			for(int j = 1; j < L; j++) {
				System.out.print(" " + C[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}

