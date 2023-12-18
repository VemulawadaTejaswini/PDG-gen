/**
 * Pizza
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int d = parseInt(line);
			if (d == 0) break;

			int n = parseInt(br.readLine());
			int m = parseInt(br.readLine());

			// store
			int[] stores = new int[n + 1];
			for (int i = 1; i < n; i++) {
				int pos = parseInt(br.readLine());
				stores[i] = pos;
			}
			stores[n] = d;
			Arrays.sort(stores);

			// order
			int sum = 0;
			for (int i = 0; i < m; i++) {
				int pos = parseInt(br.readLine());
				int min = 0, max = n - 1, mid;
				while (min <= max) {
					mid = (max + min) / 2;
					if (pos < stores[mid]) {
						max = mid - 1;
					} else if (stores[mid + 1] < pos) {
						min = mid + 1;
					} else {
						sum += Math.min(pos - stores[mid], stores[mid + 1] - pos);
						break;
					}
				}
			}
			System.out.println(sum);
		} //end while
	} //end main
}