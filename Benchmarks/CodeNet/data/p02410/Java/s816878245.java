import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = scane.nextInt();

		int m = scane.nextInt();

		int[][]  A = new int[n][m];

		int[] b = new int[m];

		int[] c = new int[n];

		for(int i=0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){

				A[i][j] = scane.nextInt();
			}
		}
		for(int i= 0; i<A[0].length; i++){
			b[i] = scane.nextInt();
		}



		for(int i=0; i<A.length; i++){
			int sum =0;
			for(int j = 0; j<A[0].length; j++){
				sum += A[i][j]*b[j];
			}

			c[i] = sum;
		}

		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}


	}
}