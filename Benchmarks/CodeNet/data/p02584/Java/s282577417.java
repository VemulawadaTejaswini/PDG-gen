
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			long k = sc.nextLong();
			long d = sc.nextLong();

			if (k <= Math.abs(x) / d) {
				System.out.println(Math.abs(x) - (k * d));
				return;
			}

			long tmp = Math.abs(x) / d;
			if (tmp % 2 == 0) {
				System.out.println(Math.abs(x) - (tmp * d));
			} else {
				System.out.println(Math.abs(Math.abs(x) - ((tmp + 1) * d)));
			}
		}
	}
}
