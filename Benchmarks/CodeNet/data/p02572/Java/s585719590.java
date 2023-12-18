import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long MOD = 1_000_000_000 + 7;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		Arrays.setAll(a, i -> sc.nextLong());
		
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = add(sum, mul(a[i], a[j]));
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
	
	static long add(long a, long b) {
		return (a + b) % MOD;
	}
	
	static long mul(long a, long b) {
		return ((a % MOD) * (b % MOD)) % MOD;
	}
}


