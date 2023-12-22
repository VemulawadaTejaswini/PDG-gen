import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			System.out.println(n / (a + b) * a + Math.min(n % (a + b), a));
		}
	}
}
