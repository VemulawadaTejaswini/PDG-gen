/**
 * Luck Manipulator
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, a, b, c, x;
			StringTokenizer st = new StringTokenizer(line);
			n = parseInt(st.nextToken());
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			c = parseInt(st.nextToken());
			x = parseInt(st.nextToken());
			if ((n | a | b | c | x) == 0) break;

			st = new StringTokenizer(br.readLine());
			int count = 0;
			int y = parseInt(st.nextToken());
			while (count <= 10000) {
				if (y == x) {
					if (st.hasMoreTokens()) {
						y = parseInt(st.nextToken());
					} else {
						break;
					}
				}
				x = (a * x + b) % c;
				count++;
			}
			System.out.println(count > 10000 ? -1 : count);
		} //end while
	} //end main
}