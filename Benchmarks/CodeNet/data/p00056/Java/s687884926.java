import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0056
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int size = sieve(50000);
		int[] ps = new int[size + 1];
		for (int i = 0; i < size + 1; i++) ps[i] = prime[i];
		
		int n;
		while ((n = sc.nextInt()) != 0) {
			int res = 0;
			for (int i = 0; i < size + 1 && ps[i] <= n; i++) {
				int a = ps[i], b = n - a;
				if (a <= b && binarySearch(ps, b) > 0) {
					res++;
				}
			}
			System.out.println(res);
		}
	}
	
	static int[] prime = new int[1000000];
	static boolean[] is_prime = new boolean[1000000 + 1];
	static int sieve(int n) {
		int p = 0;
		for (int i = 0; i <= n; i++) is_prime[i] = true;
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i <= n; i++) {
			if (is_prime[i]) {
				prime[p++] = i;
				for (int j = 2 * i; j <= n; j+= i) is_prime[j] = false;
			}
		}
		return p;
	}

}