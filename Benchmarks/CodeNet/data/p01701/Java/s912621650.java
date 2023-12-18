/**
 * North North West
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.equals("#")) break;

			// h = north
			// t = west
			List<Character> dirs = new ArrayList<Character>();
			for (int i = line.length() - 1; i >= 0; ) {
				if (line.charAt(i) == 'h') {
					dirs.add('h');
					i -= 5;
				} else {
					dirs.add('t');
					i -= 4;
				}
			}

			int numerator = 0;
			int denominator = (int) Math.pow(2, dirs.size() - 1);

			if (dirs.get(0) == 'h') {
				numerator = 0;
			} else {
				numerator = 90 * denominator;
			}
			for (int i = 1; i < dirs.size(); i++) {
				if (dirs.get(i) == 'h') {
					numerator -= 90 * denominator / (int) Math.pow(2, i);
				} else {
					numerator += 90 * denominator / (int) Math.pow(2, i);
				}
			}
			while (denominator != 1 && numerator % 2 == 0) {
				numerator /= 2;
				denominator /= 2;
			}
			System.out.println(numerator + (denominator > 1 ? "/" + denominator : ""));
		}
	} //end while
} //end main