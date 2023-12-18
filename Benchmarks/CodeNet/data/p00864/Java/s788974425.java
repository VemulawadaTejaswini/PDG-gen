import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Problem A: Grey Area
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, w;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			w = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | w) == 0) break;

			int omax = 0;   //occurence
			int imax = 0;   //interval
			int[] h = new int[n];

			for (int i = 0; i < n; i++) {
				int v = parseInt(br.readLine());
				int c = v / w;
				h[c]++;
				omax = Math.max(omax, h[c]);
				imax = Math.max(imax, c);
			}

			Fraction ans = main.new Fraction(omax, h[0]);
			for (int i = imax - 1, j = 1; i >= 0; i--, j++) {
				ans = ans.plus(main.new Fraction(imax, i).multi(main.new Fraction(omax, h[j])));
			}
			System.out.println(ans.toDouble() + 0.01);

		} //end while
	} //end main


	class Fraction {
		int d;  //denominator
		int n;  //numerator

		Fraction(int d, int n) {
			this.d = d;
			this.n = n;
		}

		Fraction plus(Fraction o) {
			int _d = lcm(this.d, o.d);
			int _n = this.n * (_d / this.d) + o.n * (_d / o.d);
			int g = gcd(_d, _n);
			_d /= g;
			_n /= g;
			return new Fraction(_d, _n);
		}

		Fraction multi(Fraction o) {
			int _d = this.d * o.d;
			int _n = this.n * o.n;
			return new Fraction(_d, _n);
		}

		double toDouble() {
			return (double) n / d;
		}
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

}