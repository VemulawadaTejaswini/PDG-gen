import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] c = new long[n][l];
		int i, j, k;
		for (i = 0; i < n ; i++) {
			for (j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < m; i++) {
			for (j = 0; j < l; j++) {
				B[i][j] = sc.nextInt();    
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < l; j++) {
				for (k = 0; k < m; k++) {
					c[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < l; j++) {
				if (j != l - 1) {
					System.out.printf("%d ", c[i][j]);
				}
				else {
					System.out.printf("%d\n", c[i][j]);
				}
			}
		}
	}
}
