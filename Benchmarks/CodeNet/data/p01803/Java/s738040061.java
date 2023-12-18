import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Airport Codes
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			String[] ports = new String[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				ports[i] = genCode(br.readLine());
				max = Math.max(max, ports[i].length());
			}

			int k = 0;
			outer:
			for (int i = max; i >= 0; i--) {
				Set<String> codes = new HashSet<>();
				for (int j = 0; j < ports.length; j++) {
					String code;
					if (ports[j].length() <= i) {
						code = ports[j];
					} else {
						code = ports[j].substring(0, i);
					}
					if (codes.contains(code)) {
						break outer;
					} else {
						codes.add(code);
					}
				}
				k = i;
			}
			System.out.println(k == 0 ? -1 : k);
		} //end while
	} //end main

	static String genCode(String str) {
		StringBuilder sb = new StringBuilder();

		sb.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			char c = str.charAt(i - 1);
			if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}