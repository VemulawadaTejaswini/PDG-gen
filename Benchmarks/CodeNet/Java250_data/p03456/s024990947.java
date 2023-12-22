import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

		for (int i = 1; i <= ab; i++) {
			if (i * i == ab) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}
}
