import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
		}
	}
}
