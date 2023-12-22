import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (Math.abs(a - x) < Math.abs(b - x)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
