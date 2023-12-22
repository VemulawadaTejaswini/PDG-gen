import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] set = br.readLine().split(" ");
		int n = Integer.parseInt(set[0]);
		int m = Integer.parseInt(set[1]);
		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];

		for(int i = 0; i < n; i++){
			String[] row = br.readLine().split(" ");
			for(int j = 0; j < m; j++) {
				A[i][j] = Integer.parseInt(row[j]);
			}
		}

		for(int j = 0; j < m; j++) {
			b[j] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++) {
				c[i] += A[i][j] * b[j];
			}
		}

		for(int i = 0; i < n; i++){
			System.out.println(c[i]);
			}
		}

}