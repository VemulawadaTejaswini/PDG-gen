import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		int n = Integer.parseInt(strAry[0]);
		int m = Integer.parseInt(strAry[1]);
		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		for (int i = 0; i < n; i++) {
			String[] strMat = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				matrix[i][j] = Integer.parseInt(strMat[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			vector[i] = Integer.parseInt(br.readLine());
		}
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] += matrix[i][j] * vector[j];
				}
			System.out.println(c[i]);
		}
	}
}