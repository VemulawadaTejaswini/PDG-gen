import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Problem B: Old Bridges
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[][] a = new int[n + 1][2];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				a[i + 1][0] = parseInt(line.substring(0, line.indexOf(' ')));
				a[i + 1][1] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			Arrays.sort(a, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] == o2[0]) {
						return Integer.compare(o1[1], o2[1]);
					} else {
						return Integer.compare(o1[0], o2[0]);
					}
				}
			});

			boolean ans = true;

			for (int i = 1; i <= n; i++) {
				a[i][0] += a[i - 1][0];
				if (a[i][0] > a[i][1]) {
					ans = false;
					break;
				}
			}

			System.out.println(ans ? "Yes" : "No");

		}
	}
}