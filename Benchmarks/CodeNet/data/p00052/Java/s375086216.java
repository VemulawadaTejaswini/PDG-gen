import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger big;
		int n;
		int count;
		
		big = new BigInteger("1");
		n = sc.nextInt();
		while (n != 0) {
			count = 0;
			big = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				big = big.multiply(new BigInteger(Integer.toString(i)));
			}
			while (big.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
				big = big.divide(BigInteger.TEN);
				count++;
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}
}