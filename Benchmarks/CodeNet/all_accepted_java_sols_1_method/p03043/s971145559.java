import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		BigDecimal n = new BigDecimal(N);
		int binaryTarget = Integer.toBinaryString(K).length();
		String binaryLong = Integer.toBinaryString(K);
		int diff = N - K;
		BigDecimal ans = BigDecimal.ZERO;
		if (diff < 0) {
			for (int i = 1; i < N + 1; i++) {
				int a = Integer.toBinaryString(i).length();
				long a_bin = Long.parseLong(Integer.toBinaryString(i));
				long sub = Long.parseLong(binaryLong.substring(0, a));
				int b = binaryTarget - a;
				if (a_bin < sub) {
					b++;
				}
				if (a_bin == sub && binaryLong.substring(a, binaryTarget).contains("1")) {
					b++;
				}
				BigDecimal c = new BigDecimal(Math.pow(2, b)).multiply(n);
				ans = ans.add(BigDecimal.ONE.divide(c, 15, BigDecimal.ROUND_DOWN));
			}
		} else {
			for (int i = 1; i < K + 1; i++) {
				int a = Integer.toBinaryString(i).length();
				long a_bin = Long.parseLong(Integer.toBinaryString(i));
				long sub = Long.parseLong(binaryLong.substring(0, a));
				int b = binaryTarget - a;
				if (a_bin < sub) {
					b++;
				}
				if (a_bin == sub && binaryLong.substring(a, binaryTarget).contains("1")) {
					b++;
				}
				BigDecimal c = new BigDecimal(Math.pow(2, b)).multiply(n);
				ans = ans.add(BigDecimal.ONE.divide(c, 15, BigDecimal.ROUND_DOWN));
			}
			ans = ans.add(
					BigDecimal.ONE.multiply(new BigDecimal(diff)).divide(n, 15, BigDecimal.ROUND_DOWN));
		}
		System.out.println(ans);
	}
}
