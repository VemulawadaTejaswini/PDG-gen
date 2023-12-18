import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Wire
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int x, y;
		x = parseInt(line.substring(0, line.indexOf(' ')));
		y = parseInt(line.substring(line.indexOf(' ') + 1));

		int g = gcd(x, y);

		int ans = 0;

		ans += g + 1;
		ans += (x / g - 1) * g;
		ans += (y / g - 1) * g;

		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}