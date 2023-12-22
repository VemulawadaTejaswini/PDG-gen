import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<l; j++){
				B[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				for(int k=0; k<m; k++){
					C[i][j] += A[i][k] * B[k][j];
				}
				if(j == l-1)
					System.out.print(C[i][j]);
				else
					System.out.print(C[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}