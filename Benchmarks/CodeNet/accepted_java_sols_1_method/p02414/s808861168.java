import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = 0, m = 0, l = 0;

		n = scane.nextInt();
		m = scane.nextInt();
		l = scane.nextInt();

		int[][] A = new int[n][m];

		int[][] B = new int[m][l];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = scane.nextInt();
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				B[i][j] = scane.nextInt();
			}
		}

		long sum =0;
		int i;
		for (int k = 0; k < A.length; k++) {
			for ( i = 0; i < B[0].length; i++) {
				sum =0;
				for (int j = 0; j < B.length; j++) {

					sum +=A[k][j] * B[j][i];
				}
				if(i ==B[0].length-1){
					System.out.print(sum);
				}else {
					System.out.print(sum+" ");
				}

			}
			System.out.println("");
		}

	}
}