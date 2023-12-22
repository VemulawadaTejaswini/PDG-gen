import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[][] gA = new int[n][m];
		int[][] gB = new int[m][l];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				gB[i][j] = sc.nextInt();
			}
		}
		sc.close();

		long[][] gC = new long[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {

				long val = 0;
				for (int k = 0; k < m; k++) {
					val += gA[i][k] * gB[k][j];
				}
				gC[i][j] = val;
			}
		}

		for(long[] c : gC) {
			StringJoiner sj = new StringJoiner(" ");
			for(long val : c) {
				sj.add(String.valueOf(val));
			}
			System.out.println(sj);
		}
	}
}