import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long  b = scan.nextLong();
		long c = scan.nextLong();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println(0);
			return;
		}
		if (a >= b && a >= c) {
			System.out.println(b * c);
		} else if (b >= a && b >= c) {
			System.out.println(a * c);
		} else {
			System.out.println(a * b);
		}
	}
}
