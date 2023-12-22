import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt(), l = scanner.nextInt();
		long[][] a = new long[n][m], b = new long[m][l];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				a[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < l; ++j) {
				b[i][j] = scanner.nextInt();
			}
		}
		long[][] c = new long[n][l];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < l; ++j) {
				for (int k = 0; k < m; ++k) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < l; ++j) {
				if (j != 0) System.out.print(' ');
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}

