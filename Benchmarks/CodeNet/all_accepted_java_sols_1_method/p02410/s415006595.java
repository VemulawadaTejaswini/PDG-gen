import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] matSize = in.readLine().split(" ");
		int n = Integer.parseInt(matSize[0]);
		int m = Integer.parseInt(matSize[1]);
		int[][] matrix = new int[n][m];
		int[] vectorB = new int[m];
		for (int i = 0; i < n; i += 1) {
			String[] input = in.readLine().split(" ");
			for (int j = 0; j < m; j += 1) {
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}
		for (int s = 0; s < m; s += 1) {
			vectorB[s] = Integer.parseInt(in.readLine());
		}
		for (int t = 0; t < n; t += 1) {
			int ans = 0;
			for (int u = 0; u < m; u += 1) {
				ans += matrix[t][u] * vectorB[u];
			}
			System.out.println(ans);
		}
	}
}