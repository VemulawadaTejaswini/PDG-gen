import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		long[][] A = new long[n][m];
		long[][] B = new long[m][l];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextLong();
			}
		}
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < l; k++) {
				B[j][k] = sc.nextLong();
			}
		}

		long[][] sum = new long[n][l];

		for (int p = 0; p < n; p++) {
			for (int q = 0; q < l; q++) {
				sum[p][q] = 0;
				for (int k = 0; k < m; k++) {
					sum[p][q] = sum[p][q] + A[p][k] * B[k][q];
				}
				if (q != l - 1) {
					System.out.print(sum[p][q] + " ");
				} else {
					System.out.print(sum[p][q]);
				}
			}
			System.out.println("");
		}

	}

}

