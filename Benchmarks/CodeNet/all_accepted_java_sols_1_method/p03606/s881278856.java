import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(scanner.nextInt() - scanner.nextInt()) + 1;
		}

		System.out.println(ans);
	}
}
