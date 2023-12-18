import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

/**
 * Substring
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		String s = br.readLine();
		int l = 0, r = 1;
		Set<Integer> subs = new HashSet<>();

		for (int i = 0; i < m; i++) {
			switch (br.readLine()) {
				case "L++":
					l++;
					break;
				case "L--":
					l--;
					break;
				case "R++":
					r++;
					break;
				case "R--":
					r--;
					break;
			}
			subs.add(s.substring(l, r).hashCode());
		}
		System.out.println(subs.size());
	}
}