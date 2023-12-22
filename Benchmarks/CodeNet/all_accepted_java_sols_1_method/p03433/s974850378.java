import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			System.out.println((a >= (n % 500)) ? "Yes" : "No");
		}
	}
}
