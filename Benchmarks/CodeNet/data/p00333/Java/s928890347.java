import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * New Town
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int W, H, C;

		StringTokenizer st = new StringTokenizer(br.readLine());
		W = parseInt(st.nextToken());
		H = parseInt(st.nextToken());
		C = parseInt(st.nextToken());

		int gcd = gcd(W, H);

		System.out.println(W * H / gcd / gcd * C);
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}