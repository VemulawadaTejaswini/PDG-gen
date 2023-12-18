import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static final int[] C = {-3, -2, -1};
	static final int[] A = {0, -1, -1};
	static final int[] N = {0, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int q;
			q = Integer.parseInt(line);
			//
			for (int i = 0; i < q; i++) {
				int c, a, n;
				int[][][] memo;
				StringTokenizer st = new StringTokenizer(br.readLine());
				c = Integer.parseInt(st.nextToken());
				a = Integer.parseInt(st.nextToken());
				n = Integer.parseInt(st.nextToken());
				memo = new int[c + 1][a + 1][n + 1];

				//
				int max = 0;
				ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
				queue.add(new int[]{c, a, n, 0});
				while (!queue.isEmpty()) {
					int[] can = queue.poll();
					for (int j = 0; j < 3; j++) {
						int nc, na, nn;
						nc = can[0] + C[j];
						na = can[1] + A[j];
						nn = can[2] + N[j];
						if (nc >= 0 && na >= 0 && nn >= 0 && memo[nc][na][nn] == 0) {
							queue.add(new int[]{nc, na, nn, can[3] + 1});
							memo[nc][na][nn] = can[3] + 1;
						} else {
							if (can[3] > max) {
								max = can[3];
							}
						}
					}
				}
				System.out.println(max);
			}
		}
	}
}