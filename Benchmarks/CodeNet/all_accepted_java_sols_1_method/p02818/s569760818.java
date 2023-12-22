
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();

			if (a + b <= k) {
				System.out.println("0 0");
			} else {
				long resultA = 0;
				long resultB = 0;
				if (a <= k) {
					resultB = b - k + a;
				} else {
					resultA = a - k;
					resultB = b;
				}
				System.out.println(resultA + " " + resultB);
			}
		}
	}
}
