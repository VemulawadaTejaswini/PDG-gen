import java.util.Arrays;
import java.util.Scanner;

public class Main {

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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			boolean[] primes = sieve(n);
			int cnt = 0;
			if (n >= 2) {
				cnt = 1;
				for (int i = 3; i <= n; i += 2)
					if (primes[i]) cnt++;
			}
			System.out.println(cnt);
		}

	}

}