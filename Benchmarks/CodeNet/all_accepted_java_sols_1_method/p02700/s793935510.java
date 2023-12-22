import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			int c = scanner.nextInt(), d = scanner.nextInt();
			System.out.println(((c + b - 1) / b <= (a + d - 1) / d) ? "Yes" : "No");
		}
	}
}
