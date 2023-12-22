import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n, m, l;

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();
		m = stdIn.nextInt();
		l = stdIn.nextInt();

		int[][] matrixA = new int[n][m];
		int[][] matrixB = new int[m][l];
		long[][] matrixC = new long[n][l];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrixA[i][j] = stdIn.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				matrixB[i][j] = stdIn.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
//					System.out.println("i:" + i + " j:" + j + " k:" + k + " " + matrixA[i][k] + " * " + matrixB[k][j] + " C : " + matrixC[i][j]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(matrixC[i][j]);
				if (j < l-1) {
					System.out.print(" ");
				}
			}
			
				System.out.println();
			
		}
	}
}