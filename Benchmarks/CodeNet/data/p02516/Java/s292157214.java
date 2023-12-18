import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] count = new long[1000001];
	static ArrayList<Integer> primes = primes(count.length + 1);

	public static void main(String[] args) throws Exception {
		count[1] = 2;
		for (int i = 2; i < count.length; ++i) {
			count[i] = count[i - 1] + totient(i);
		}
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			System.out.println(count[sc.nextInt()]);
		}
	}

	static int totient(int n) {
		long ret = n;
		for (int i = 0; i < primes.size() && n > 1; ++i) {
			int p = primes.get(i);
			if (p * p > n) {
				ret *= n-1;
				ret /= n;
				break;
			}
			if (n % p == 0) {
				ret *= p - 1;
				ret /= p;
				while (n % p == 0) {
					n /= p;
				}
			}
		}
		return (long)ret;
	}

	public static ArrayList<Integer> primes(int max) {
		if (max < 2) {
			return new ArrayList<Integer>();
		}
		BitSet primeSet = new BitSet(max / 2);
		primeSet.set(1, max / 2);
		int limit = (int) Math.sqrt(max);
		for (int i = 3; i <= limit; i += 2) {
			if (!primeSet.get(i / 2)) {
				continue;
			}
			for (int j = i * i; j < max; j += i * 2) {
				primeSet.clear(j / 2);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for (int i = primeSet.nextSetBit(0); i >= 0; i = primeSet.nextSetBit(i + 1)) {
			list.add(i * 2 + 1);
		}
		return list;
	}

}