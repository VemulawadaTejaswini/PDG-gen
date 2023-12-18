import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Let's Solve Geometric Problems
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int p, q;
		p = parseInt(line.substring(0, line.indexOf(' ')));
		q = parseInt(line.substring(line.indexOf(' ') + 1));

		System.out.println(q / gcd(p, q));

	}//end main

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}