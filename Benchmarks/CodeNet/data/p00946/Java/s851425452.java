import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Rearranging a Sequence
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] seq = new int[n + 1];
		int head = 1;

		seq[0] = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) seq[i] = i;

		for (int i = 0; i < m; i++) {
			int e = parseInt(br.readLine());
			seq[e] = --head;
		}

		int[][] res = new int[n + 1][2];

		for (int i = 0; i <= n; i++) {
			res[i][0] = i;
			res[i][1] = seq[i];
		}

		Arrays.sort(res, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(res[i][0]).append('\n');
		}

		System.out.print(sb.toString());

	}
}