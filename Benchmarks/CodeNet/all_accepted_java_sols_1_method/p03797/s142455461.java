import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			System.out.println((m > 2 * n) ? (m - 2 * n) / 4 + n : m / 2);
		}
	}
}
