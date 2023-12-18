import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();

		long x = c - a - b;
		long y = 0;

		//System.out.println(x);
		if (x < 0) {
			System.out.println("No");
		} else {
			y = x * x - 4 * a * b;
			//System.out.println(y);
			if (y > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}