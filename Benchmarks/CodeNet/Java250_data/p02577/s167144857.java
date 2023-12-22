import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		sc.close();
		prtln(n.remainder(new BigInteger("9")).equals(new BigInteger("0")) ? "Yes" : "No");
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
