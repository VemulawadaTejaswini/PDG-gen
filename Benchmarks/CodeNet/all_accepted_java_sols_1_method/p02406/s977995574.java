
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		int y;
		do {
			if (x % 3 == 0 || x % 10 == 3) {
				System.out.printf(" %d", x);
			} else if (x >= 30) {
				y = x;
				while (y >= 30) {
					y = y / 10;
					if (y == 3 || y % 10 == 3) {
						System.out.printf(" %d", x);
						break;
					}
				}
			}
		} while (++x <= n);
		System.out.println();
	}

}