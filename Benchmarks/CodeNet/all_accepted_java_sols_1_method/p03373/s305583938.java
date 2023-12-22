import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int x = scanner.nextInt();
			int y = scanner.nextInt();

			long sum = a * x + b * y;

			int abmin = Math.min(x, y);
			long temp = c * abmin * 2;
			if (x > y) {
				temp += a * (x - y);
			} else if (x < y) {
				temp += b * (y - x);
			}
			if (temp < sum) {
				sum = temp;
			}

			int abmax = Math.max(x, y);
			temp = abmax * 2 * c;
			if (temp < sum) {
				sum = temp;
			}

			System.out.println(sum);
		}
	}
}
