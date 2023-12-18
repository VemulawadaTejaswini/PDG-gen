import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Eleven Lover
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			line += "_";

			int count = 0;
			for (int i = 0; i < line.length() - 2; i++) {
				for (int j = i + 2; j < line.length(); j++) {
					String s = line.substring(i, j);
					if (s.charAt(0) == '0') continue;
					//
					long mod = 0;
					if (s.length() > 18) {
						mod = mod(s);
					} else {
						mod = parseLong(s) % 11;
					}
					if (mod == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main

	static long mod(String s) {

		String mod = "0";
		for (int i = 0; i < s.length(); i += 17) {
			String _s = "";
			if (i + 17 <= s.length()) {
				_s = mod + s.substring(i, i + 17);
			} else {
				_s = mod + s.substring(i);
			}
			mod = String.valueOf(parseLong(_s) % 11);
		}
		return parseLong(mod);
	}
}