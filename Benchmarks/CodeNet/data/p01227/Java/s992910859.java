import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Country Road
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int t = parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			line = br.readLine();
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int k = parseInt(line.substring(line.indexOf(' ') + 1));

			if (n <= k) {
				br.readLine();
				System.out.println(0);
				continue;
			}

			//
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);

			int[] d = new int[n - 1];
			int ans = 0;

			int prev = parseInt(st.nextToken());

			for (int j = 0; j < n - 1; j++) {
				int next = parseInt(st.nextToken());
				d[j] = next - prev;
				prev = next;
				ans += d[j];
			}

			Arrays.sort(d);

			for (int j = 0, l = d.length - 1; j < k - 1 && l > 0; j++, l--) {
				ans -= d[l];
			}

			System.out.println(ans);
		}
	}
}