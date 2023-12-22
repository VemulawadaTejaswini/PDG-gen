import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int modNum = 1000000007;

		BigInteger ten = BigInteger.valueOf(10);
		BigInteger nine = BigInteger.valueOf(9);
		BigInteger eight = BigInteger.valueOf(8);

		BigInteger tenN = ten.pow(n);
		BigInteger nineN = nine.pow(n);
		BigInteger eightN = eight.pow(n);

		long ans = tenN.add(nineN.negate()).add(nineN.negate()).add(eightN).mod(BigInteger.valueOf(modNum)).longValue();

		System.out.println(ans);

	}
}