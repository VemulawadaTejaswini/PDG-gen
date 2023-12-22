import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][1];
		int[][] output = new int[n][1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i< m; i++) {
			b[i][0] = sc.nextInt();
		}

		for (int i = 0; i< n; i++) {
			for (int j = 0; j < m; j++) {
				output[i][0] += a[i][j] * b[j][0];
			}
		}

		for (int i = 0; i<n; i++) {
			System.out.println(output[i][0]);
		}
	}
}