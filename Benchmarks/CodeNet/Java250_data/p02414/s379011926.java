import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] matrixFormat = (input.readLine()).split("\\s");

		int n = Integer.parseInt(matrixFormat[0]);
		int m = Integer.parseInt(matrixFormat[1]);
		int l = Integer.parseInt(matrixFormat[2]);

		int[][] matrixA = new int[n][m];
		int[][] matrixB = new int[m][l];
		long[][] matrixC = new long[n][l];

		String[] dataMatrixA = null;
		for (int i = 0; i < n; i++) {
			dataMatrixA = (input.readLine()).split("\\s");
			for (int j = 0; j < m; j++) {
				matrixA[i][j] = Integer.parseInt(dataMatrixA[j]);
			}
		}

		String[] dataMatrixB = null;
		for (int k = 0; k < m; k++) {
			dataMatrixB = (input.readLine()).split("\\s");
			for (int h = 0; h < l; h++) {
				matrixB[k][h] = Integer.parseInt(dataMatrixB[h]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < l; k++) {
					matrixC[i][k] += (matrixA[i][j] * matrixB[j][k]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				if (j > 0) {
					System.out.print(" ");
				}
				System.out.print(matrixC[i][j]);
			}
			System.out.println();
		}
	}
}

