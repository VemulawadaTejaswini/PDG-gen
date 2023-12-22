import java.math.BigInteger;

public class Main {
	final private static BigInteger BIG_8 = BigInteger.valueOf(8);
	final private static BigInteger BIG_9 = BigInteger.valueOf(9);
	final private static BigInteger BIG_2 = BigInteger.valueOf(2);

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var m = BigInteger.valueOf(1000000000 + 7);
		var all = BigInteger.TEN.pow(n);
		var all9 = BIG_9.pow(n);
		var all8 = BIG_8.pow(n);
		var etc = all9.multiply(BIG_2).subtract(all8);
		System.out.println(all.subtract(etc).mod(m));
	}
}
