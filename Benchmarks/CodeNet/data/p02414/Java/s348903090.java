import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		// ?????? A ??\???
		int[][] A;
		A = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		// ?????? B ??\???
		int[][] B;
		B = new int[m][l];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				B[i][j] = scan.nextInt();
			}
		}

		// ?????? C ??\???
		long[][] C;
		C = new long[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					C[i][j] = C[i][j] + A[i][k] * B[k][j];
				}
			}
		}
		
		
		

		for (int i = 0; i < n; i++) {

			int j = 0;
			System.out.print(C[i][j]);
			
			for (j = 1; j < l; j++) {
				System.out.print(" " + C[i][j]);
			}
			System.out.println();
		}

	}

}