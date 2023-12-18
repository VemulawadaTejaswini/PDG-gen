import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Problem B: Let's JUMPSTYLE
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			int[][][] G = new int[N][N][2];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					G[j][i][0] = parseInt(st.nextToken());
					G[j][i][1] = parseInt(st.nextToken());
				}
			}

			int[][] check = new int[N][N];
			int timestamp = 0;
			int count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (check[i][j] == 0) {
						check[i][j] = ++timestamp;
						int _j = G[i][j][0];
						int _i = G[i][j][1];
						while (check[_j][_i] == 0) {
							check[_j][_i] = timestamp;
							_j = G[_j][_i][0];
							_i = G[_j][_i][1];
						}
						if (check[_j][_i] == timestamp) {
							count++;
						}
					}
				}
			}

			System.out.println(count);
		}
	}
}