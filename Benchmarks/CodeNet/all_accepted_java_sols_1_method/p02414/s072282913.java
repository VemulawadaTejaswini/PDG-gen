import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		long[][] A = new long[n][m];
		long[][] B = new long[m][l];
		long[][] C = new long[n][l];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < l; i++) {
				B[j][i] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					C[i][j] += (A[i][k] * B[k][j]);
				}
				System.out.printf("%d", C[i][j]);
				if(j != (l-1)) {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}

