import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Rummy
 */
public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int T = parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());

			int[] R = new int[10];
			int[] G = new int[10];
			int[] B = new int[10];

			for (int j = 0; j < 9; j++) {
				int n = parseInt(st1.nextToken());
				switch (st2.nextToken().charAt(0)) {
					case 'R':
						R[n]++;
						break;
					case 'G':
						G[n]++;
						break;
					case 'B':
						B[n]++;
						break;
				}
			}

			//
			int count = solve(R, 1, 0) + solve(G, 1, 0) + solve(B, 1, 0);
			System.out.println(count >= 3 ? 1 : 0);
		}
	}

	public static int solve(int[] cards, int s, int c) {

		if (s == 10) return c;

		int c1 = 0, c2 = 0, c3 = 0;

		if (cards[s] >= 3) {
			int[] _cards = cards.clone()
			_cards[s] -= 3;
			c1 = solve(_cards, s + 1, c + 1);
		}

		if (s <= 7 && cards[s] >= 1 && cards[s + 1] >= 1 && cards[s + 2] >= 1) {
			int[] _cards = cards.clone()
			_cards[s]--;
			_cards[s + 1]--;
			_cards[s + 2]--;
			if (_cards[s] >= 1) {
				c2 = solve(_cards, s, c + 1);
			} else {
				c2 = solve(_cards, s + 1, c + 1);
			}
		}

		c3 = solve(cards, s + 1, c);

		return Math.max(c1, Math.max(c2, c3));
	}
}