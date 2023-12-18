import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[] primes = new boolean[50001];
		Arrays.fill(primes, true);
		for (int i = 2; i < 50001; i++) {
			for (int j = 2; j < 50001 / i; j++) {
				primes[i * j] = false;
			}
		}

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int c = 0;

			for (int i = 2; i < n / 2 + 1; i++) {
				if (i * 2 == n) {
					c++;
				} else if (primes[i] && primes[n - i]) {
					c++;
				}
			}
			System.out.println(c);
		}

	}
	
}