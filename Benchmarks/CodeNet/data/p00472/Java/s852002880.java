import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A Traveler
 * JOI 9th, Fin.1
 */
public class Main {

	static final int MOD = 100000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, m;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));

			int[] d = new int[n];

			for (int i = 1; i <= n - 1; i++) {
				d[i] = d[i - 1] + Integer.parseInt(br.readLine());
			}

			long sum = 0;
			int inn = 0;

			for (int i = 0; i < m; i++) {
				int _inn = parseInt(br.readLine());
				sum += Math.abs(d[inn + _inn] - d[inn]);
				sum %= MOD;
				inn += _inn;
			}
			System.out.println(sum);
		}
	}
}