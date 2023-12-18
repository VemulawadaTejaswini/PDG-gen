import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Lightest Mobile
 */
public class Main {

	static Bar[] bars;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			bars = new Bar[n + 1];
			for (int i = 0; i <= n; i++) {
				bars[i] = main.new Bar();
			}

			StringTokenizer st;
			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				int p, q, r, b;
				p = parseInt(st.nextToken());
				q = parseInt(st.nextToken());
				r = parseInt(st.nextToken());
				b = parseInt(st.nextToken());
				bars[i].p = p;
				bars[i].q = q;
				if (r != 0) {
					bars[i].r = bars[r];
					bars[r].parent = bars[i];
				}
				if (b != 0) {
					bars[i].b = bars[b];
					bars[b].parent = bars[i];
				}
			}

			for (int i = 1; i <= n; i++) {
				if (bars[i].parent == null) {
					System.out.println(bars[i].weight());
					break;
				}
			}
		}
	}


	static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	class Bar {
		long p, q;
		Bar parent, r, b;

		Bar() {
		}

		long weight() {

			long _p, _q, gcd = 1;
			gcd = gcd(p, q);
			_p = p / gcd;
			_q = q / gcd;

			if (r == null && b == null) return (_p + _q) / gcd(_p, _q);

			long _r = 1, _b = 1, lcm = 1;
			if (r != null) _r = r.weight();
			if (b != null) _b = b.weight();
			lcm = lcm(lcm(_p, _q), lcm(_r, _b));
			_r = lcm / _p;
			_b = lcm / _q;
			return _r + _b;
		}
	}
}