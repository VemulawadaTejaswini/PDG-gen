import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Grid Mori
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n, a, b, c, d;

		n = parseInt(br.readLine());

		line = br.readLine();
		a = parseInt(line.substring(0, line.indexOf(' ')));
		b = parseInt(line.substring(line.indexOf(' ') + 1));

		line = br.readLine();
		c = parseInt(line.substring(0, line.indexOf(' ')));
		d = parseInt(line.substring(line.indexOf(' ') + 1));

		a--;
		b--;
		c--;
		d--;

		int min = Integer.MAX_VALUE;

		for (int w = 1; w <= n; w++) {
			int[] pa = new int[]{a % w, a / w};
			int[] pb = new int[]{b % w, b / w};
			int[] pc = new int[]{c % w, c / w};
			int[] pd = new int[]{d % w, d / w};
			int _min = 0;
			_min += Math.abs(pa[0] - pb[0]);
			_min += Math.abs(pa[1] - pb[1]);
			_min += Math.abs(pc[0] - pd[0]);
			_min += Math.abs(pc[1] - pd[1]);
			min = Math.min(min, _min);
		}

		System.out.println(min);
	}
}