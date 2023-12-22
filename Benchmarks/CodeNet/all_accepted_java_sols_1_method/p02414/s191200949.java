import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		String[] string1 = line1.split(" ");
		int n = Integer.parseInt(string1[0]);
		int m = Integer.parseInt(string1[1]);
		int l = Integer.parseInt(string1[2]);

		String[][] gyouA = new String[n][m];
		int[][] A = new int[n][m];
		for (int i = 0; i < n; i++) {
			String line2 = sc.nextLine();
			for (int j = 0; j < m; j++) {
				String[] string = line2.split(" ");
				gyouA[i][j] = string[j];
				A[i][j] = Integer.parseInt(gyouA[i][j]);
			}

		}

		String[][] gyouB = new String[m][l];
		int[][] B = new int[m][l];
		for (int i = 0; i < m; i++) {
			String line3 = sc.nextLine();
			for (int j = 0; j < l; j++) {
				String[] string = line3.split(" ");
				gyouB[i][j] = string[j];
				B[i][j] = Integer.parseInt(gyouB[i][j]);
			}

		}

		long AB = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				long C = 0;
				for (int k = 0; k < m; k++) {
					AB = A[i][k] * B[k][j];
					C += AB;
				}
				if (j == l - 1) {
					System.out.print(C);

				} else {
					System.out.print(C + " ");

				}
			}
			System.out.println();
		}
	}
}