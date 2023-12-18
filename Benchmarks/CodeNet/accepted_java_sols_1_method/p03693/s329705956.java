import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();

		if ((r * 100 + g * 10 + b) % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}