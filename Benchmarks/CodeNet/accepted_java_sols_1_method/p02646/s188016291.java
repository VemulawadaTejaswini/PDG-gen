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

		// v <= w なら追いつけない
		if (v <= w) {
			System.out.println("NO");
			return;
		}
		// v > w だったらt秒間に間を詰められるか計算する
		if (a < b) {// 鬼が後ろにいる
			BigInteger bigT = BigInteger.valueOf(t);
			BigInteger avt = BigInteger.valueOf(a).add(BigInteger.valueOf(v).multiply(bigT));
			BigInteger bwt = BigInteger.valueOf(b).add(BigInteger.valueOf(w).multiply(bigT));

			if (avt.compareTo(bwt) != -1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else { // 鬼が前にいる
			BigInteger bigT = BigInteger.valueOf(t);
			BigInteger avt = BigInteger.valueOf(a).add(BigInteger.valueOf(v).multiply(bigT).negate());
			BigInteger bwt = BigInteger.valueOf(b).add(BigInteger.valueOf(w).multiply(bigT).negate());

			if (avt.compareTo(bwt) != 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
