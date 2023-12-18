import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Lottery Checker
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, m;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;

			Map<String, Integer> hits = new HashMap<>();

			for (int i = 0; i < n; i++) {
				words = br.readLine().split(" ");
				hits.put(words[0].replace("*", ""), parseInt(words[1]));
			}

			int sum = 0;

			for (int i = 0; i < m; i++) {
				String lott = br.readLine();
				int max = 0;
				for (int j = 0; j <= lott.length(); j++) {
					String _lott = lott.substring(j, lott.length());
					if (hits.get(_lott) != null) {
						max = Math.max(max, hits.get(_lott));
					}
				}
				sum += max;
			}

			System.out.println(sum);
		}
	}
}