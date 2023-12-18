import java.math.BigInteger;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long K = scn.nextLong();
		long[] arr = new long[(int) N];
		for (long i = 0; i < N; i++) {
			arr[(int) i] = scn.nextLong();
		}
		long ans = maxProductSubarrayOfSizeK(arr, N, K);
		if (ans < 0) {
			ans = 1000000007 + ans;
		}
		System.out.println(ans);
	}

	public static long maxProductSubarrayOfSizeK(long A[], long n, long k) {
		Arrays.sort(A);
		long product = 1;
		product = product % 1000000007;
		if (A[(int) n - 1] == 0 && k % 2 != 0)
			return 0;
		if (A[(int) n - 1] <= 0 && k % 2 != 0) {
			for (long i = n - 1; i >= n - k; i--) {
				product *= A[(int) i] % 1000000007;
				product = product % 1000000007;
			}
			product = product % 1000000007;
			return product;
		}
		long i = 0;
		long j = n - 1;
		if (k % 2 != 0) {
			product *= A[(int) j] % 1000000007;
			product = product % 1000000007;
			j--;
			k--;
		}
		k >>= 1;
		for (long itr = 0; itr < k; itr++) {
			long left_product = A[(int) i] * A[(int) i + 1] % 1000000007;
			long right_product = A[(int) j] * A[(int) j - 1] % 1000000007;
			if (left_product > right_product) {
				product *= left_product % 1000000007;
				product = product % 1000000007;
				i += 2;
			} else {
				product *= right_product % 1000000007;
				product = product % 1000000007;
				j -= 2;
			}
		}
		product = product % 1000000007;
		return product;
	}
}