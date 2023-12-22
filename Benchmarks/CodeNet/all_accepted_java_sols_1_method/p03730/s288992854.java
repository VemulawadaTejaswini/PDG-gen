import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		for (int i = a; i <= b * a; i += a) {
			if (i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}