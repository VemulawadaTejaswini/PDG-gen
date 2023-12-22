import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();

			int temp = n % 500;
			if (temp <= a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
