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
		for (int x = 1; x <= n/2; x++) {
			if ((x * x) >= n) {
				continue;
			}
			for (int y = 1; y <= n/2; y++) {
				if ((y * y) >= n || (x * y) >= n) {
					continue;
				}
				for (int z = 1; z <= n/2; z++) {
					 if ((z * z) >= n || (z * x) >= n || (y * z) >= n) {
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