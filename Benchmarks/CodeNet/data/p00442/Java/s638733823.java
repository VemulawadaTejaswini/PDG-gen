import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Worst Sportswriter
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			int m = parseInt(br.readLine());

			int[][] rank = new int[n + 1][3];
			for (int i = 0; i < n + 1; i++) {
				rank[i][0] = i;
			}

			rank[0][1] = -n;
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				int a = parseInt(line.substring(0, line.indexOf(' ')));
				int b = parseInt(line.substring(line.indexOf(' ') + 1));
				rank[a][1]++;
				rank[b][1]--;
			}

			// ranking
			Arrays.sort(rank, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[1] - o1[1];
				}
			});

			boolean alt = false;
			rank[0][2] = 1;
			for (int i = 1; i < n + 1; i++) {
				rank[i][2] = i + 1;
				if (rank[i - 1][1] == rank[i][1]) {
					alt = true;
				}
			}

			Arrays.sort(rank, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});

			for (int i = 1; i < n + 1; i++) {
				System.out.println(rank[i][2]);
			}
			if (alt) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}

		}

	}
}