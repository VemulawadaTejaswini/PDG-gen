import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = scane.nextInt();

		int m = scane.nextInt();

		int[][]  A = new int[n][m];

		int[] b = new int[m];

		for(int i=0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){

				A[i][j] = scane.nextInt();
			}
		}
		for(int i= 0; i<A[0].length; i++){
			b[i] = scane.nextInt();
		}

		int c1 =0, c2=0, c3=0;

		for(int i=0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){


				if(i ==0){
				c1 += A[i][j]*b[j];
				}else if (i == 1) {
					c2 += A[i][j]*b[j];
				}else if (i == 2) {
					c3 += A[i][j]*b[j];
				}
			}
		}

		System.out.print(c1+"\n"+c2+"\n"+c3+"\n");

	}
}