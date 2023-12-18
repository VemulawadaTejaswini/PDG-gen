package aoj.volume10.uapc2009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Problem J: ICPC: Ideal Coin Payment and Change
 */
public class Main {

	final static int[] values = new int[]{1, 5, 10, 50, 100, 500};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");
			if (words[0].equals("0")) break;

			int price = 0, total = 0;
			int[] coins = new int[values.length];

			for (int i = 0; i < words.length; i++) {
				if (i == 0) {
					price = parseInt(words[i]);
				} else {
					coins[i - 1] = parseInt(words[i]);
					total += values[i - 1] * coins[i - 1];
				}
			}

			//
			int[] dpp = new int[total + 1];
			int[] dpc = new int[total - price + 1];

			for (int i = 1; i < dpc.length; i++) dpc[i] = i;
			for (int i = 2; i < dpc.length; i++) {
				for (int j = 0; j < values.length; j++) {
					if (i - values[j] >= 0)
						dpc[i] = Math.min(dpc[i], dpc[i - values[j]] + 1);
				}
			}

			for (int i = 0; i < dpp.length; i++) dpp[i] = i;
			for (int i = 1; i < values.length; i++) {
				for (int j = 0; j <= coins[i]; j++) {
					for (int k = values[i]; k < dpp.length; k++) {
						if (k - values[i] * j >= 0)
							dpp[k] = Math.min(dpp[k], dpp[k - values[i] * j] + j);
					}
				}
			}

			int min = Integer.MAX_VALUE;
			for (int i = total; i >= price; i--) {
				min = Math.min(min, dpp[i] + dpc[i - price]);
			}
			System.out.println(min);
		}
	}
}