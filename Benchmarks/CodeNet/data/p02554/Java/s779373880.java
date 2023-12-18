import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		long ans = modpow(10, n, 1000000007) - modpow(9, n, 1000000007) - modpow(9, n, 1000000007)
				+ modpow(8, n, 1000000007);
		ans %= 1000000007;
		ans = (ans + 1000000007) % 1000000007;
		System.out.println(ans);
	}

	static long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1)
				res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
}