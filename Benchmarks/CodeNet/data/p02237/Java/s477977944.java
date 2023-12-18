import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int u = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				int v = Integer.parseInt(st.nextToken());
				matrix[u-1][v-1] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(matrix[i][0]);
			for (int j = 1; j < n; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println("");
		}
		reader.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

