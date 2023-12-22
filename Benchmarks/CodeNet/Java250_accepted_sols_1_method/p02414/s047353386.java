
import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		
		//input
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		for(int v = 0; v < n; v++) {
			for(int h = 0; h < l; h++) {
				for(int k = 0; k < m; k++) {
					C[v][h] += A[v][k] * B[k][h];
				}
			}
		}
		//output
		for(int v = 0; v < n; v++) {
			for(int h = 0; h < l; h++) {
				if(h != l-1) {
					System.out.print(C[v][h] + " ");
				} else {
					System.out.println(C[v][h]);
				}
			}
		}
	}
}
