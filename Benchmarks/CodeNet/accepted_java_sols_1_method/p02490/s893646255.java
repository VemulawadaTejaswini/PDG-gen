import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k;

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0)
				break;
			if (x > y) {
				k = x;
				x = y;
				y = k;
			}

			System.out.printf("%d %d\n", x, y);
		}

	}
}