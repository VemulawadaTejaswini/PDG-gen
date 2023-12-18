import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static long sqrt(BigInteger v) {
		long min = 1;
		long max = Long.MAX_VALUE / 2;
		while (max - min > 1) {
			BigInteger mid = BigInteger.valueOf((min + max) / 2);
			BigInteger mul = mid.multiply(mid);
			if (v.compareTo(mul) < 0) {
				max = (min + max) / 2;
			} else {
				min = (min + max) / 2;
			}
		}
		return min;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			long[] vals = new long[n * (n + 1) / 2];
			for (int i = 0; i < vals.length; ++i) {
				vals[i] = Long.parseLong(sc.next());
			}
			BigInteger a2 = BigInteger.valueOf(vals[0]).multiply(BigInteger.valueOf(vals[1]))
					.divide(BigInteger.valueOf(vals[n]));
			long a = sqrt(a2);
			System.out.println(a);
			System.out.print(vals[0] / a);
			for (int i = 1; i < n; ++i) {
				System.out.print(" " + vals[i] / a);
			}
			System.out.println();
		}
	}
}