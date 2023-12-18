import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	// エラトステネスのふるい(n以下の素数を求める)
	public static boolean[] sieve (int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		for (int i = 4; i < isPrime.length; i += 2)
			isPrime[i] = false;
		for (int i = 3; i * i <= n; i += 2) {
			for (int j = 3; i * j <= n; j += 2)
				isPrime[i * j] = false;
		}
		return isPrime;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		boolean[] primes = sieve(10000);

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			int sum = 0, cnt = 0;
			for (int i = 2; cnt < n; i++) {
				if (primes[i]) {
					sum += i;
					cnt++;
				}
			}
			System.out.println(sum);
		}

	}

}