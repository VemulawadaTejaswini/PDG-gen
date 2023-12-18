import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		boolean[] notPrime = new boolean[50001];
		notPrime[0] = true;
		notPrime[1] = true;
		int primeCount = 50000 - 1;
		for (int i = 4; i <= 50000; i += 2) {
			if (!notPrime[i]) {
				notPrime[i] = true;
				primeCount--;
			}
			if (!notPrime[i - 1]) {
				for (int j = (i - 1) * 2; j <= 50000; j += i - 1) {
					if (!notPrime[j]) {
						notPrime[j] = true;
						primeCount--;
					}
				}
			}
		}
		int[] primes = new int[primeCount];
		int index = 0;
		for (int i = 0; i <= 50000; i++) {
			if (!notPrime[i]) {
				primes[index++] = i;
			}
		}
		int[] gbc = new int[50001];
		for (int i = 0; i < primes.length; i++) {
			for (int j = i; j < primes.length; j++) {
				int val = primes[i] + primes[j];
				if (val > 50000) {
					break;
				}
				gbc[val]++;
			}
		}

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n != 0) {
				System.out.println(gbc[n]);
			}
		}

	}
}