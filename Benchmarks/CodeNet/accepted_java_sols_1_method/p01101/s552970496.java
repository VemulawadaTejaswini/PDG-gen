import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Taro's Shopping
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

			int[] a = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				a[i] = parseInt(st.nextToken());
			}

			int max = -1;

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int b = a[i] + a[j];
					if (b <= m && b > max) max = b;
				}
			}

			System.out.println(max > -1 ? max : "NONE");
		}
	}
}