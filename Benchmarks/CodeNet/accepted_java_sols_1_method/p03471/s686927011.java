import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int Y = scanner.nextInt();

		for (int x = 0; x <= n; x++) {
			for (int y = 0; y <= n; y++) {
				int z = n - x - y;
				if ((10000 * x + 5000 * y + 1000 * z) == Y && z >= 0) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}

		System.out.println(-1 + " " + -1 + " " + -1);
	}
}
