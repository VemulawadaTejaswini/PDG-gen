import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Twin Prime
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[] primes = new boolean[10001];

		Arrays.fill(primes, true);
		for (int i = 2; i < 10001; i++) {
			if (primes[i]) {
				for (int j = 2; j * i < 10001; j++) {
					if (primes[i * j]) {
						primes[i * j] = false;
					}
				}
			}
		}

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			for (int i = n; i > 1; i--) {
				if (primes[i] && primes[i - 2]) {
					System.out.println(i - 2 + " " + i);
					break;
				}
			}
		}

	}

}