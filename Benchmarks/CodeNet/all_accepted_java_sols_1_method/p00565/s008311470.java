import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Sugoroku
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());
		int count = 0;
		int max = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			if (st.nextToken().equals("1")) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}

		System.out.println(max + 1);
	}
}
