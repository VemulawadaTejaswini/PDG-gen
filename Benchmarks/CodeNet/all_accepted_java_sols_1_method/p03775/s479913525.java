/**
 * ACB057-C-Digits in Multiplication
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		long N = parseLong(br.readLine());

		int min = String.valueOf(N).length();

		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) min = Math.min(min, String.valueOf(N / i).length());
		}

		System.out.println(min);
	}
}