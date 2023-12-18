import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Eleven Lover
 */
public class Main {

	static String line;
	static String _sub;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			line += "_";

			int count = 0;
			for (int i = 0; i < line.length() - 2; i++) {
				for (int j = i + 2; j < line.length(); j++) {
					if (line.charAt(0) == '0') continue;
					//
					long mod = 0;
					if (j - i > 18) {
						mod = mod11(i, j);
					} else {
						mod = num(i, j, 0) % 11;
					}
					if (mod == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main

	static long num(int i, int j, int s) {
		long l = s;
		for (int k = j - 1; k >= i; k--) {
			l *= 10;
			l += line.charAt(k) - '0';
		}
		return l;
	}

	static long mod11(int i, int j) {

		int mod = 0;
		for (; i < j; i += 17) {
			long _num = 0;
			if (i + 17 < j) {
				_num = num(i, i + 17, mod);
			} else {
				_num = num(i, j, mod);
			}
			mod = (int) (_num % 11);
		}
		return mod;
	}
}