/**
 * King's Inspection
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[] keys = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				keys[i] = parseInt(st.nextToken());
			}

			line = br.readLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				c -= keys[i % n];
				if ('Z' < c && c < 'a') {
					c -= 6;
				} else if (c < 'A') {
					c += 58;
				}
				sb.append((char) c);
			}
			System.out.println(sb.toString());
		} //end while
	} //end main
}