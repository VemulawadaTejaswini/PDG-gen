import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int N = 1000000;
		boolean[] primes = new boolean[N + 1];

		primes[0] = true;
		primes[1] = true;
		for (int i = 2; i < N / 2 + 1; i++) {
			for (int j = 2; j < N / i + 1; j++) {
				primes[i * j] = true;
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			int count = 0;
			for (int i = n; i > n / 2 - 1; i--) {
				if (!primes[i] && !primes[n - i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}