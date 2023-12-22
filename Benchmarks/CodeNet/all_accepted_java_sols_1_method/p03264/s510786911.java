import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for (int i = 1; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j += 2) {
				if (i <= n && j <= n) {
					ans++;
				}

			}
		}
		System.out.println(ans);

	}
}
