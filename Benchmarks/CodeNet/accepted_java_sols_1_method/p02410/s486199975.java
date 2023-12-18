import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		String[] string1 = line1.split(" ");
		int n = Integer.parseInt(string1[0]);
		int m = Integer.parseInt(string1[1]);

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

		String[] retB = new String[m];
		int[] B = new int[retB.length];
		for (int i = 0; i < m; i++) {
			String line3 = sc.nextLine();
			retB[i] = line3;
			B[i] = Integer.parseInt(retB[i]);
		}

		int AB = 0;
		for (int j = 0; j < n; j++) {
			int C = 0;
			for (int k = 0; k < m; k++) {
				AB = A[j][k] * B[k];
				C += AB;
			}
			System.out.println(C);
		}

	}
}