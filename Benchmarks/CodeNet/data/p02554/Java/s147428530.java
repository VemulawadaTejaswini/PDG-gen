
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

//Main
public class Main {
	static int mod=(int)1e9+7; 

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n=sc.nextInt();
		long ans = power(10, n) - 2 * power(9, n) + power(8, n);
		ans = ((ans % mod) + mod) % mod;
		System.out.println(ans);

	}
	static long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % mod;
			}
			y = (y * y) % mod;
			b /= 2;
		}
		return x % mod;
	}
	

	static final Random random = new Random();

	static void ruffleSort(int[] a) {
		int n = a.length;//shuffle, then sort 
		for (int i = 0; i < n; i++) {
			int oi = random.nextInt(n), temp = a[oi];
			a[oi] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
