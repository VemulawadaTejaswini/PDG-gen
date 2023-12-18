import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Make Purse Light
 */
public class Main {

	public static int[] values = {10, 50, 100, 500};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		boolean hasNext = false;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int price = parseInt(line);
			if (price == 0) break;

			int[] coins1 = new int[4];
			int[] coins2 = new int[4];

			StringTokenizer st = new StringTokenizer(br.readLine());
			coins1[0] = parseInt(st.nextToken());
			coins1[1] = parseInt(st.nextToken());
			coins1[2] = parseInt(st.nextToken());
			coins1[3] = parseInt(st.nextToken());

			int change = coins1[0] * values[0]
					+ coins1[1] * values[1]
					+ coins1[2] * values[2]
					+ coins1[3] * values[3]
					- price;

			for (int i = 3; i >= 0; i--) {
				coins2[i] = change / values[i];
				change %= values[i];
			}

			for (int i = 0; i < 4; i++) {
				coins2[i] = coins1[i] - coins2[i];
			}

			if (hasNext) System.out.println();
			for (int i = 0; i < 4; i++) {
				if (coins2[i] > 0)
					System.out.println(values[i] + " " + coins2[i]);
			}
			hasNext = true;

		} //end while
	} //end main
}