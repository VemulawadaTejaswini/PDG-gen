import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Graph I - Graph
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			int[][] g = new int[n][n];

			int k, p, q;
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				p = Integer.parseInt(st.nextToken());
				p--;
				k = Integer.parseInt(st.nextToken());
				for (int j = 0; j < k; j++) {
					q = Integer.parseInt(st.nextToken());
					q--;
					g[p][q] = 1;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j < n - 1) {
						System.out.print(g[i][j] + " ");
					} else {
						System.out.print(g[i][j] + "\n");
					}
				}
			}
		}
	}
}