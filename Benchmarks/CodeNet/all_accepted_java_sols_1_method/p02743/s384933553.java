
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, c;
		a = new BigInteger(sc.next());
		b = new BigInteger(sc.next());
		c = new BigInteger(sc.next());
		System.out
				.println(a.multiply(b).multiply(new BigInteger("4")).compareTo(c.subtract(a).subtract(b).pow(2)) == -1 && c.subtract(a).subtract(b).compareTo(new BigInteger("0")) == 1 ? "Yes" : "No");

	}

}
