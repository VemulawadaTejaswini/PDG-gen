
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int count = 0;
			for (int i = n; i <= m; i++) {
				if (slove(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	private static boolean slove(int i) {
		while (true) {
			if (i % 2 == 0) {
				i /= 2;
			} else if (i % 3 == 0) {
				i /= 3;
			} else if (i % 5 == 0) {
				i /= 5;
			} else {
				break;
			}
		}

		return i == 1;
	}
}