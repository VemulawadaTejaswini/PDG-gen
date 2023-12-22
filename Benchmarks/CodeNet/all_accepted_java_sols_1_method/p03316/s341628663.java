import java.util.Scanner;

public class Main {

	/**
	 * Digit Sums
	 */
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = n;
			int s = 0;
			while (m > 0) {
				s = s + (m % 10);
				m = m / 10;
			}
			if (n % s == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}