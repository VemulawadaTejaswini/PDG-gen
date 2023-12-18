import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Hamming Distance
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N, D;
		char[] X;

		N = parseInt(br.readLine());
		X = br.readLine().toCharArray();
		D = parseInt(br.readLine());

		char[] ans = Arrays.copyOf(X, N);

		for (int i = 0; i < N || D == 0; i++) {
			if (X[i] == '0') {
				ans[i] = '1';
				D--;
			}
		}

		for (int i = N - 1; i >= 0 || D == 0; i--) {
			if (X[i] == '1') {
				ans[i] = '0';
				D--;
			}
		}

		System.out.println(String.valueOf(ans));

	} //end main
}