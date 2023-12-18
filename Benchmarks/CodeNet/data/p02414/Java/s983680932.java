import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int i;
			int j;
			int k;

			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();

			int A[][] = new int[n][m];
			int B[][] = new int[m][l];
			int C[][] = new int[n][l];

			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					int a_ij = sc.nextInt();
					A[i][j] = a_ij;
				}
			}

			for(i = 0; i < m; i++) {
				for(j = 0; j < l; j++) {
					int b_ij = sc.nextInt();
					B[i][j] = b_ij;
				}
			}

			for(i = 0; i < n; i++) {
				for(j = 0; j < l; j++) {
					for(k = 0; k < m; k++) {
						C[i][j] = C[i][j] + A[i][k] * B[k][j];
					}
					if(j == l - 1) {
						System.out.println(C[i][j]);
					} else {
						System.out.print(C[i][j] + " ");
					}
				}
			}

	}
}