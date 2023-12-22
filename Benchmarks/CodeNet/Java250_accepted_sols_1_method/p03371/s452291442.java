import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 2147483647;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int max = 0;
		if (x > y) {
			max = x;
		} else {
			max = y;
		}

		min = a * x + b * y;

		for (int i = 1; i <= max; i++) {
			if (i > x) {
				if (min > (2 * c * i) + (y - i) * b) {
					min = (2 * c * i) + (y - i) * b;
				}
			} else if (i > y) {
				if (min > (2 * c * i) + (x - i) * a) {
					min = (2 * c * i) + (x - i) * a;
				}
			} else if (min > (2 * c * i) + (x - i) * a + (y - i) * b) {
				min = (2 * c * i) + (x - i) * a + (y - i) * b;
			}

		}

		System.out.println(min);
	}
}
