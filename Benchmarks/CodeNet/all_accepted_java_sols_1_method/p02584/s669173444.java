import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long x = scanner.nextLong(), k = scanner.nextLong(), d = scanner.nextLong();
			x = Math.abs(x);
			if (k < (x / d)) {
				System.out.println(x - k * d);
			} else {
				k -= x / d;
				if (0 == (k & 1)) {
					System.out.println(x - (x / d) * d);
				} else {
					System.out.println(Math.abs(x - (x / d) * d - d));
				}
			}
		}
	}
}
