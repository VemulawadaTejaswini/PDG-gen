import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[m][l];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				b[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				long seki = 0;
				for(int k = 0; k < m; k++) {
					seki += a[i][k] * b[k][j];
				}
				if(j != 0) {
					System.out.printf(" ");
				}
				System.out.printf("%d", seki);
			}
			System.out.println();
		}

		scan.close();
	}
}
