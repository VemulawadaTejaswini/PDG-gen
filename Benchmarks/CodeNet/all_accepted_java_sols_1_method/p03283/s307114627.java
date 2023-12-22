import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter(System.out); Scanner sc = new Scanner(System.in);) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			List<int[]> listlr = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				int[] lr = new int[2];
				lr[0] = sc.nextInt() - 1;
				lr[1] = sc.nextInt() - 1;
				listlr.add(lr);
			}

			int[][] t = new int[n][n];

			for (int[] lr : listlr) {
				t[lr[0]][lr[1]]++;
			}

			for (int i = 1; i < n; i++) {
				for (int j = i - 1; j >= 0; j--) {
					t[j][i] = t[j][i] + t[j + 1][i];
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					t[i][j] = t[i][j] + t[i][j - 1];
				}
			}

			for (int i = 0; i < q; i++) {
				out.println(t[sc.nextInt() - 1][sc.nextInt() - 1]);
			}

		}
	}

}
