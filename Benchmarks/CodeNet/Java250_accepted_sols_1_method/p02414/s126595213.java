import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[m][l];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = scan.nextInt();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < l; j++)
				b[i][j] = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				if (j > 0)
					System.out.print(" ");
				long ans = 0;
				for (int w = 0; w < m; w++)
					ans += (a[i][w] * b[w][j]);
				System.out.print(ans);
			}
			System.out.println();

		}
		System.exit(0);
	}

}