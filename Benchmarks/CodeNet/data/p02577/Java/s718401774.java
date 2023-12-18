import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();

		BigInteger sum = BigInteger.ZERO;

		if (!N.equals(BigInteger.ZERO)) {
			while (!N.equals(BigInteger.ZERO)) {
				sum = sum.add(N.remainder(BigInteger.TEN));
				N = N.divide(BigInteger.TEN);
			}
		}
		String ans = "No";
		if (sum.remainder(BigInteger.valueOf(9)).equals(BigInteger.ZERO)) {
			ans = "Yes";
		}
		System.out.println(ans);

	}
}