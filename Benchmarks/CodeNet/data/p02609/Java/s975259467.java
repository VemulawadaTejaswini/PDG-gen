import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger x = new BigInteger(sc.next(), 2);
		sc.close();

		int cnt = x.bitCount();
		BigInteger p0 = BigInteger.valueOf(cnt + 1);
		BigInteger p1 = BigInteger.valueOf(cnt - 1);
		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			int next = i % Integer.bitCount(i);
			dp[i] = dp[next] + 1;
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			BigInteger val = x.flipBit(n - 1 - i);
			if (!x.testBit(n - 1 - i)) {
				int next = val.mod(p0).intValue();
				pw.println(dp[next] + 1);
			} else {
				if (p1.compareTo(BigInteger.ZERO) == 0) {
					pw.println(0);
				} else {
					int next = val.mod(p1).intValue();
					pw.println(dp[next] + 1);
				}
			}
		}
		pw.flush();
	}
}
