import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long n = sc.nextLong();

			final int MOD = 1000000007;

			long a = pow(10, n, MOD);
			long b = pow(9, n, MOD);
			long c = pow(8, n, MOD);

			long result = m_sub(a, b, MOD);
			result = m_sub(result, b, MOD);
			result = m_add(result, c, MOD);

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//return a^b mod M O(logB)
	public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
		}
		return ret;
	}

	public static long m_add(long a, long b, int MOD) {
		return ((a + b) % MOD);
	}

	public static long m_sub(long a, long b, int MOD) {
		long value = (a - b) % MOD;
		if (value < 0) {
			value += MOD;
		}
		return value;
	}

}