import java.util.*;

class Main {
	public static boolean[] sieve(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (!primes[i]) {
				continue;
			}
			for (int j = i * i; j < n; j += i) {
				primes[j] = false;
			}
		}
		return primes;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[] primes = sieve(999999);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int count = 0;
			for (int i = 2; i <= n; i++) {
				if (primes[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}