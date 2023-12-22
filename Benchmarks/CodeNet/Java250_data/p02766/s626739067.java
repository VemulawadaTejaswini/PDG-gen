import java.util.Scanner;

public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();

			int ans = 1;
			while (true) {
				if (n < Math.pow(k, ans)) {
					break;
				}

				ans++;
			}

			System.out.println(ans);
		}
	}

}
