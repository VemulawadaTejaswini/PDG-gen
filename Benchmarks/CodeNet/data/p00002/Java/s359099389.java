import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		int count;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a + b;
		count = 1;
		while (scanner.hasNext()) {
			while (10 <= c) {
				c /= 10;
				count++;
			}
			System.out.println(count);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a + b;
			count = 1;
		}
	}
}