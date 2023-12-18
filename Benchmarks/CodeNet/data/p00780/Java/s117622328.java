
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	public static final int Max = 1 << 15 - 1;
	public static final BitSet isPrime = new BitSet(Max);
	public static final ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		// init
		isPrime.set(2, Max);
		for (int i = 2; i < Max; i++) {
			if (!isPrime.get(i)) continue;
			// i is prime
			primes.add(i);
			for (int j = i * i; j < Max; j += i) {
				isPrime.clear(j);
			}
		}

		// main
		while (true) {
			final int in = sc.nextInt();
			if (in == 0) break;

			int ans = 0;
			for (Integer p : primes) {
				if (p > in / 2) break;
				final int re = in - p;
				//	if (primes.contains(remain)) ans++;
				if (isPrime.get(re)) ans++;
			}
			System.out.println(ans);
		}
	}
}