import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger total = new BigInteger("1");
		for (int i = 0; i < N; i++) {
			BigInteger a = new BigInteger(sc.next());
			total = total.multiply(a);
				
		}
		if (total.compareTo(new BigInteger("1000000000000000000")) > 0) {
			System.out.println("-1");
		} else {
			System.out.println(total);
		}
	}
}