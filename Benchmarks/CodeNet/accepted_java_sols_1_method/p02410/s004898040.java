

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		int[][] A = new int[100][100];
		int[] B = new int[100];
		int[] C = new int[100];

	    n = sc.nextInt();
	    m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for (int j = 0; j < m; j++){
			 B[j] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			C[i] = 0;
			for (int j = 0; j < m; j++){
				C[i] += A[i][j] * B[j];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(C[i]);
		}

	}

}