import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int diff = a - b * 2;
			System.out.println((diff > 0) ? diff : 0);
		}
	}
}
