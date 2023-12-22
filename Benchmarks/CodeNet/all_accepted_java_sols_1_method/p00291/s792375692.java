import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A Fat Wallet - Accepted
 * PCK2014 ??????2
 */
public class Main {

	static final int[] coins = new int[]{1, 5, 10, 50, 100, 500};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		int sum = 0;
		for (int i = coins.length - 1; i >= 0; i--) {
			sum += parseInt(words[i]) * coins[i];
			if (sum >= 1000) break;
		}
		System.out.println(sum < 1000 ? 0 : 1);
	}
}