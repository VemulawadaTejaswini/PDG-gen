import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs = br.readLine().split("\\s+");
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);

		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		
		for (int i = 0; i < n; i++) {
			strs = br.readLine().split("\\s+");
			for (int j = 0; j < m; j++) A[i][j] = Integer.parseInt(strs[j]);
		}
		
		for (int i = 0; i < m; i++) b[i] = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] += A[i][j] * b[j];
			}
			System.out.println(c[i]);
		}
		
	}
}