import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();

		int[][] a;
		a = new int[m][n];

		int[] b;
		b = new int[n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				a[i][j] = scan.nextInt();

			}

		}

		for (int j = 0; j < n; j++) {

			b[j] = scan.nextInt();

		}

		for (int i = 0; i < m; i++) {
			int c = 0;

			for (int j = 0; j < n; j++) {

				c = c + a[i][j] * b[j];

			}
			System.out.println(c);
		}

	}

}