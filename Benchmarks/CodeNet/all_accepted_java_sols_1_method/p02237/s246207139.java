import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		// 頂点の数
		int n = sc.nextInt();

		int[][] matrix = new int[n][n];

		// 各頂点
		for (int i = 0; i < n; i++) {

			// 頂点の番号(読み捨てる)
			int u = sc.nextInt();
			// 頂点の出次数
			int k = sc.nextInt();

			for (int j = 0; j < k; j++) {
				// 入力側の頂点番号 - 1
				int v = sc.nextInt() - 1;
				matrix[i][v] = 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1) {System.out.print(matrix[i][j]); continue; }
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		sc.close();

	}

}

