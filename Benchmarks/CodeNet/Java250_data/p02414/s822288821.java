import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n, m, l;
		n = scan.nextInt();
		m = scan.nextInt();
		l = scan.nextInt();
		long[][] matA = new long[n][m];
		long[][] matB = new long[m][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matA[i][j] = scan.nextInt();
			}
		}
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < l; k++) {
				matB[j][k] = scan.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < l; k++) {
				long c = 0;
				for (int j = 0; j < m; j++) {
					c += matA[i][j] * matB[j][k];
				}
				if (k != l - 1) {
					sb.append(c + " ");
				} else {
					sb.append(c + "\n");
				}
			}
		}
		System.out.print(sb);
	}
}