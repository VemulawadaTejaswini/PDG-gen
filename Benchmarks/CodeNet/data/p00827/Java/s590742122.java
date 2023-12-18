import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * The Balance
 */
public class Main {

	static final int INF = 1 << 29;
	static int xmin = 0;
	static int ymin = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int a, b, d;
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			d = parseInt(st.nextToken());
			if ((a | b | d) == 0) break;

			solve1(a, b, d);
			if (xmin == 0 && ymin == 0) {
				solve2(a, b, d);
			}
			System.out.println(xmin + " " + ymin);

		} //end while
	} //end main

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static void solve1(int a, int b, int d) {
		int g = gcd(a, b);
		int xmax = b / g;
		int ymax = a / g;

		int min = INF;
		xmin = ymin = 0;
		for (int i = -xmax; i <= xmax; i++) {
			for (int j = -ymax; j <= ymax; j++) {
				int c = a * i - b * j;
				if (c == d || c == -d) {
					if (Math.abs(i) + Math.abs(j) < min) {
						min = Math.abs(i) + Math.abs(j);
						xmin = Math.abs(i);
						ymin = Math.abs(j);
					}
				}
			}
		}
	}

	static void solve2(int a, int b, int d) {
		int g = gcd(a, b);
		int xmax = d / a;
		int ymax = d / b;

		int min = INF;
		xmin = ymin = 0;
		for (int i = -xmax; i <= xmax; i++) {
			for (int j = -ymax; j <= ymax; j++) {
				int c = a * i - b * j;
				if (c == d || c == -d) {
					if (Math.abs(i) + Math.abs(j) < min) {
						min = Math.abs(i) + Math.abs(j);
						xmin = Math.abs(i);
						ymin = Math.abs(j);
					}
				}
			}
		}
	}
}