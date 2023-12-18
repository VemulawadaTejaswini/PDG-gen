import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long x = scanner.nextLong();
		long ans = 0;

		if (a == 0) {
			ans = (b / x + 1);
		} else {
			ans = (b / x) - ((a - 1) / x);
		}
		System.out.println(ans);
	}
}