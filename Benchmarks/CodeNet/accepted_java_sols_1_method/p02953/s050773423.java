import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] h = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = scanner.nextLong();
		}
		String result = "Yes";
		for (int i = n - 1; i > 0; i --) {
			if (h[i - 1] <= h[i]) {
				continue;
			}
			h[i - 1] = h[i - 1] - 1;
			if (h[i - 1] <= h[i]) {
				continue;
			}
			result = "No";
		}
		System.out.println(result);
	}
}
