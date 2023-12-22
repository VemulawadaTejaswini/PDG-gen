import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int ans = 0;

		if (b + w < a) {
			ans = a - (b + w);
		} else if (a + w < b) {
			ans = b - (a + w);
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}
}