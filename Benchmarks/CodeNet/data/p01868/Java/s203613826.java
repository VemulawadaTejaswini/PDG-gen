import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Scanner
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());
		int[] T = new int[N];

		for (int i = 0; i < N; i++) {
			T[i] = parseInt(br.readLine());
		}
		Arrays.sort(T);

		int[] s = new int[3];
		int min = 0;

		for (int i = N - 1; i >= 0; i--) {
			min = 0;
			if (s[1] < s[min]) min = 1;
			if (s[2] < s[min]) min = 2;
			s[min] += T[i];
		}

		int max = 0;
		if (s[1] > s[max]) max = 1;
		if (s[2] > s[max]) max = 2;

		System.out.println(s[max]);

	} //end main
}