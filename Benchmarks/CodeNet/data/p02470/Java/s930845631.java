import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Long> primes = new ArrayList<Long>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long n = Long.parseLong(str);
		PrimeFactorize(n);
		long phi = n;
		for (long prime : primes) {
			phi = phi * (prime - 1) / prime;
		}
		System.out.println(phi);

	}

	private static void PrimeFactorize(long a) {
		long div = a;
		Boolean isBig = true;
		for (long i = 2; isBig; i++) {
			if (div % i == 0) {
				div = div / i;
				if (primes.size() == 0) {
					primes.add(i);
				} else if (i != primes.get(primes.size() - 1)) {
					primes.add(i);
				}
				i--;
			}
			isBig = i < Math.pow(div, 0.5);
		}
		if (div != 1 && div != primes.get(primes.size() - 1)) {
			primes.add(div);
		}
	}
}