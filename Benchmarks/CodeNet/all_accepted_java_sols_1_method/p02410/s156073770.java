import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] A = new int[n][m];
		int[] B = new int[m];
		int[] C = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <  m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				C[i] += A[i][j] * B[j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(C[i]);
		}
	}

}

