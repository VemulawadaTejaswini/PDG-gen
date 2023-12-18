/**
 * Square Route
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int m = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;

			//
			int[] ns = new int[n + 1];
			int[] ms = new int[m + 1];

			for (int i = 1; i < n + 1; i++) {
				ns[i] = parseInt(br.readLine()) + ns[i - 1];
			}
			for (int i = 1; i < m + 1; i++) {
				ms[i] = parseInt(br.readLine()) + ms[i - 1];
			}

			//
			int[][] nm = new int[Math.max(ns[n], ms[m]) + 1][2];

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n + 1; j++) {
					nm[ns[j] - ns[i]][0]++;
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = i + 1; j < m + 1; j++) {
					nm[ms[j] - ms[i]][1]++;
				}
			}

			int sum = 0;
			for (int i = 1; i < nm.length; i++) {
				if (nm[i][0] != 0 && nm[i][1] != 0)
					sum += nm[i][0] * nm[i][1];
			}
			System.out.println(sum);
		} //end while
	} //end main
}