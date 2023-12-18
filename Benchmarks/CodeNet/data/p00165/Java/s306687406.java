
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	static final int MAX_N = 1000000;
	boolean[] isPrime = new boolean[MAX_N];
	int[] primes;
	int[] acc;
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
		
		acc = new int[MAX_N];
		for (int i = 1; i < MAX_N; i++) {
			acc[i] = acc[i-1] + (isPrime[i] ? 1 : 0);
		}
	}
	
	int get(int a, int b) {
		if (a < 1) a = 1;
		if (b >= MAX_N) b = MAX_N - 1;
		return acc[b] - acc[a-1];
	}
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		makePrimes();
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			long ans = 0;
			for (int iii = 0; iii < n; iii++) {
				int p = sc.nextInt();
				int m = sc.nextInt();
				int x = get(p - m, p + m);
				ans += x - 1;
			}
			System.out.println(ans);
		}
	}
}