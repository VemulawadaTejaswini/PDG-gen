/**
 * When Can We Meet?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int q = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | q) == 0) break;

			int[] meets = new int[101];
			int[] dates = new int[n + 1];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int m = parseInt(st.nextToken());
				for (int j = 0; j < m; j++) {
					int date = parseInt(st.nextToken());
					int meet = ++meets[date];
					if (dates[meet] == 0) {
						dates[meet] = date;
					} else {
						dates[meet] = Math.min(dates[meet], date);
					}
				}
			}
			int ans = 0;
			for (int i = n; i >= q; i--) {
				if (dates[i] != 0) {
					ans = dates[i];
					break;
				}
			}
			System.out.println(ans);
		} //end while
	} //end main
}