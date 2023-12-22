import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Problem A: Traffic Analysis
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, m;
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;

			int[] times = new int[n + m + 1];

			if (n != 0) {
				words = br.readLine().split(" ");
				for (int i = 0; i < n; i++) {
					times[i + 1] = parseInt(words[i]);
				}
			}

			if (m != 0) {
				words = br.readLine().split(" ");
				for (int i = 0; i < m; i++) {
					times[i + n + 1] = parseInt(words[i]);
				}
			}
			Arrays.sort(times);

			int max = 0;
			for (int i = 1; i < times.length; i++) {
				max = Math.max(max, times[i] - times[i - 1]);
			}
			System.out.println(max);
		}
	}
}