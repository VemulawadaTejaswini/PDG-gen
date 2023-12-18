import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int A[][] = new int[n][m];
		int B[][] = new int[m][l];
		long C[][] = new long[n][l];

		// ??????A
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		// ??????B
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		// ???
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < l; k++) {
					C[i][k] += A[i][j] * B[j][k];
				}
			}
		}

		// ??????
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l - 1; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println(C[i][l - 1]);
		}

	}

}