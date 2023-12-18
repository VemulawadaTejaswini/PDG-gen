import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * A Fat Wallet
 * PCK2014 ??????2
 */
public class Main {

	static final int[] coins = new int[]{1, 5, 10, 50, 100, 500};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int sum = 0;
		for (int i = 0; i < coins.length; i++) {
			sum += parseInt(st.nextToken()) * coins[i];
		}
		System.out.println(sum < 1000 ? 0 : 1);
	}
}