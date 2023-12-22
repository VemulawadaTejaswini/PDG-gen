import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n, m, l;
		long x, sum;
		int[][] matA, matB;
		String[] mats = in.readLine().split(" ");
		n = Integer.parseInt(mats[0]);
		m = Integer.parseInt(mats[1]);
		l = Integer.parseInt(mats[2]);
		matA = new int[n][m];
		matB = new int[m][l];
		for (int i = 0; i < n; i += 1) {
			String[] arrayA = in.readLine().split(" ");
			for (int j = 0; j < m; j += 1) {
				matA[i][j] = Integer.parseInt(arrayA[j]);
			}
		}
		for (int p = 0; p < m; p += 1) {
			String[] arrayB = in.readLine().split(" ");
			for (int q = 0; q < l; q += 1) {
				matB[p][q] = Integer.parseInt(arrayB[q]);
			}
		}
		in = null;
		for (int s = 0; s < n; s += 1) {
			x = 0;
			for (int t = 0; t < l; t += 1) {
				sum = 0;
				for (int u = 0; u < m; u += 1) {
					x = (matA[s][u] * matB[u][t]);
					sum += x;
				}
				sb.append(sum);
				if (t != (l - 1)) {
					sb.append(" ");
				}
			}
			sb.append(System.getProperty("line.separator"));
		}
		System.out.print(sb);
	}
}