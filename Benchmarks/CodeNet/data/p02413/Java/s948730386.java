import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt(), c = scanner.nextInt();
		int[][] a = new int[r + 1][c + 1];
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				a[i][j] = scanner.nextInt();
				a[r][j] += a[i][j];
				a[i][c] += a[i][j];
				a[r][c] += a[i][j];
			}
		}
		for (int i = 0; i <= r; ++i) {
			for (int j = 0; j <= c; ++j) {
				if (j != 0) System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
