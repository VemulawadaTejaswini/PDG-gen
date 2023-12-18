import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++) {
			a[i] = new int[m];
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int[][] b = new int[m][];
		for (int i = 0; i < m; i++) {
			b[i] = new int[l];
			for (int j = 0; j < l; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				long c = 0;
				for (int k = 0; k < m; k++) {
					c += a[i][k] * b[k][j];
				}
				if (j == 0) {
					System.out.print(c);
				} else System.out.print(" " + c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}