import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Nearest Two Points
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());
		long[][] a = new long[n][2];

		for (int i = 0; i < n; i++) {
			line = br.readLine();
			a[i][0] = parseInt(line.substring(0, line.indexOf(' ')));
			a[i][1] = parseInt(line.substring(line.indexOf(' ') + 1));
		}

		Arrays.sort(a, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0], o2[0]);
			}
		});

		double L = Long.MAX_VALUE;
		long SQ = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[i][0] - a[j][0] >= L) break;
				long sq = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
				if (sq < SQ) {
					SQ = sq;
					L = Math.sqrt(SQ);
				}
			}
		}

		System.out.println(SQ);
	}
}