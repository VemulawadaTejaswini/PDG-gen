import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(((n + 1000 - 1) / 1000 * 1000 - n));
		}
	}
}
