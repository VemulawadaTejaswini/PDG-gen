import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];

		for(int i=0; i<n; i++){
			for(int s=0; s<m; s++){
				A[i][s] = scan.nextInt();
			}
		}
		for(int i=0; i<m; i++){
			b[i] = scan.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				c[i] += A[i][j]*b[j];
			}
			System.out.println(c[i]);
		}
	}
}