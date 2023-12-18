/**
 * Problem E: Binary Digit A Doctor Loved
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.charAt(0) == '-') {
				break;
			}

			int ni;
			double nd;
			ni = Integer.parseInt(line.substring(0, line.indexOf('.')));
			nd = Double.parseDouble("0" + (line.substring(line.indexOf('.')))) * 16;

			if (ni > 255 || nd % 1.0 > 0.0) {
				System.out.println("NA");
			} else {
				char[] si, sd;
				si = new char[8];
				sd = new char[4];

				for (int i = 7; i >= 0; i--) {
					if ((ni & (int) (Math.pow(2, i))) != 0) {
						si[7 - i] = '1';
					} else {
						si[7 - i] = '0';
					}
				}

				for (int i = 3; i >= 0; i--) {
					if (((int) nd & (int) (Math.pow(2, i))) != 0) {
						sd[3 - i] = '1';
					} else {
						sd[3 - i] = '0';
					}
				}
				System.out.println(new String(si) + "." + new String(sd));
			}
		}

	}
}