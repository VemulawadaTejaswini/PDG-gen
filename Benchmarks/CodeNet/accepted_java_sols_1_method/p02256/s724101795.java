import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int a, b, c, d;
		if (x > y) {
			a = x;
			b = y;
		} else {
			a = y;
			b = x;
		}
		if (a % 2 == 1 && b % 2 == 0) {
			for (int i = b - 1; i > 0; i -= 2) {
				c = a % i;
				if (c == 0) {
					d = b % i;
					if (d == 0) {
						System.out.println (i);
						break;
					}
				}
			}
		} else {
			for (int i = b; i > 0; i -= 2) {
				c = a % i;
				if (c == 0) {
					d = b % i;
					if (d == 0) {
						System.out.println (i);
						break;
					}
				}
			}
		}
	}
}
