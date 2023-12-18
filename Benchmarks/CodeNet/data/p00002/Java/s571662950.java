import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		int count;

		while (true) {
			count = 1;
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = a + b;
			while (10 <= c) {
				c /= 10;
				count++;
			}
			System.out.println(count);
		}
	}
}