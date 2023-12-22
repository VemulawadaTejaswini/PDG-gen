import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();

			System.out.println((int)Math.ceil((a + b) / 2));
		}
	}
}