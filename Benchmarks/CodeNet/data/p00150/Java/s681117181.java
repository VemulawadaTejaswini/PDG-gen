import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int N = 10000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[][] primes = new boolean[N + 1][2];

		for (int i = 2; i < N / 2 + 1; i++) {
			if (!primes[i][0]) {
				for (int j = i * 2; j < N + 1; ) {
					primes[j][0] = true;
					j += i;
				}
				if (!primes[i - 2][0]) {
					primes[i][1] = true;
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			for (int i = n; i > 4; i--) {
				if (primes[i][1]) {
					System.out.println(i - 2 + " " + i);
					break;
				}
			}
		}
	}
}