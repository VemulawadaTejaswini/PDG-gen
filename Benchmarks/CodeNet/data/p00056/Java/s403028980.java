
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		makePrimes();
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			int res = 0;
			for (int p1: primes) {
				if (p1 < n && isPrime[n - p1] && p1 >= n - p1) {
					res++;
				}
			}
			System.out.println(res);
		}
	}
	

	static final int MAX_N = 50000 + 10;
	boolean[] isPrime = new boolean[MAX_N];
	int[] primes;
	void makePrimes(){
		if (primes != null) return;
		for (int i = 0; i < isPrime.length; i++) isPrime[i] = true;
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i * i < isPrime.length; i++)
			if (isPrime[i])
				for(int j = i * i; j < isPrime.length; j += i)
					isPrime[j] = false;
		int p = 0;
		for (int i = 2; i < isPrime.length; i++) p += isPrime[i] ? 1 : 0;
		primes = new int[p];
		p = 0;
		for (int i = 2; i < isPrime.length; i++) if (isPrime[i]) primes[p++] = i;
	}
}