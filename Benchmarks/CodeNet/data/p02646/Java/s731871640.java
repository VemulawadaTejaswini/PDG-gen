import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		sc.close();

		if (a < b) {// 鬼が後ろにいる
			BigInteger bigT = BigInteger.valueOf(t);
			BigInteger avt = BigInteger.valueOf(a).add(BigInteger.valueOf(v).multiply(bigT));
			BigInteger bwt = BigInteger.valueOf(b).add(BigInteger.valueOf(w).multiply(bigT));

			if (avt.compareTo(bwt) != -1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			return;
		} else { // 鬼が前にいる
			do {
				b += w;
				if (a <= b) {
					System.out.println("YES");
					return;
				}
			} while (--t != 0);
			System.out.println("NO");
		}
	}
}
