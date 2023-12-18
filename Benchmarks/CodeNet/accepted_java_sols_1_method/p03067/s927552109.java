import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (a < c && c < b) {
				System.out.println("Yes");
			} else if (b < c && c < a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
