import java.math.BigInteger;

public class Main {
	final private static BigInteger BIG_2 = BigInteger.valueOf(2);
	final private static BigInteger BIG_3 = BigInteger.valueOf(3);
	final private static BigInteger BIG_5 = BigInteger.valueOf(5);

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var s = sc.nextBigInteger();
		var m = BigInteger.valueOf(1000000000 + 7);
		var cnt = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ONE; i.compareTo(s.divide(BIG_3)) <= 0; i = i
				.add(BigInteger.ONE)) {
			cnt = cnt.add(func(i, s));
		}
		System.out.println(cnt.mod(m));
	}

	public static BigInteger func(BigInteger len, BigInteger sum) {
		if (BigInteger.ZERO.equals(len)) {
			return BigInteger.ZERO;
		}
		if (sum.divide(len).compareTo(BIG_3) < 0) {
			return BigInteger.ZERO;
		}
		if (BigInteger.ONE.equals(len)) {
			return BigInteger.ONE;
		}
		if (BIG_2.equals(len)) {
			return sum.subtract(BIG_5);
		}
		BigInteger i = BIG_3;
		BigInteger nextMin = len.subtract(BigInteger.ONE).multiply(BIG_3);
		BigInteger cnt = BigInteger.ZERO;
		BigInteger remI = sum.subtract(i);
		BigInteger nextLen = len.subtract(BigInteger.ONE);
		for (;; i = i.add(BigInteger.ONE), remI = remI.subtract(BigInteger.ONE)) {
			if (remI.compareTo(nextMin) < 0) {
				break;
			}
			cnt = cnt.add(func(nextLen, remI));
		}
		return cnt;
	}
}
