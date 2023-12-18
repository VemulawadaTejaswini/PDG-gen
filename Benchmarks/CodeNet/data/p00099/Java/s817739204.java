/**
 * Surf Smelt Fishing Contest II
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, q;
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] as = new int[n + 1];
			int amax = Integer.MAX_VALUE, vmax = Integer.MIN_VALUE;

			int a, v;
			for (int i = 0; i < q; i++) {
				line = br.readLine();
				a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				v = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				as[a] += v;
				if (as[a] > vmax) {
					vmax = as[a];
					amax = a;
				} else if (as[a] == vmax && a < amax) {
					amax = a;
				}
				System.out.println(amax + " " + vmax);
			}
		}
	}
}