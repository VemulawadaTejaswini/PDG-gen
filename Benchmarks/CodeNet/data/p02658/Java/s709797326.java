import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		BigInteger max = BigInteger.valueOf((long)Math.pow(10, 18));

		BigInteger num = BigInteger.valueOf(1);

		for (int i = 0; i < n; i++) {
			num = num.multiply(BigInteger.valueOf(stdIn.nextLong()));
		}

		if(num.compareTo(max) > 0) {
			System.out.println(-1);
		} else {
			System.out.println(num);
		}

		stdIn.close();
	}
}
