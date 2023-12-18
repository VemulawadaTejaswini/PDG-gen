import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt(), h = scanner.nextInt();
			System.out.println((a + b) * h / 2);
		}
	}
}
