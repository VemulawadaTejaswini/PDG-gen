import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int ans = x - a;
		while (ans >= b) {
			ans -= b;
		}

		System.out.println(ans);
	}
}
