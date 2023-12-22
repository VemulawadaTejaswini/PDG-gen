import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Card Game
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		final int[] cards = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int c1, c2, c3, own;
			c1 = Integer.parseInt(st.nextToken());
			c2 = Integer.parseInt(st.nextToken());
			c3 = Integer.parseInt(st.nextToken());
			own = c1 + c2;

			boolean[] hands = new boolean[11];
			hands[c1] = hands[c2] = hands[c3] = true;

			int p = 0;
			for (int i = 1; i < 11; i++) {
				if (!hands[i] && cards[i] + own <= 20) {
					p++;
				}
			}

			// if (p / 7.0 >= 0.5) {
			if (p > 3) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}