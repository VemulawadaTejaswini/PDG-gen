import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int N = Integer.parseInt(data);

			for (int i = 1; i <= N; i++) {
				System.out.println(count(i));
			}
		}
	}

	private static int count(int n) {
		int count = 0;
		for (int x = 1; x <= n; x++) {
			if ((x * x) >= n) {
				continue;
			}
			for (int y = 1; y <= n; y++) {
				if ((y * y) >= n) {
					continue;
				}
				for (int z = 1; z <= n; z++) {
					if ((z * z) >= n) {
						continue;
					}

					if (calc(x, y, z) == n) {
						count++;
					}
				}
			}
		}
		return count;
	}

	private static long calc(int x, int y, int z) {
		return (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x);
	}
}