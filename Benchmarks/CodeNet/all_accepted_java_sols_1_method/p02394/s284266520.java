import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int w = sc.nextInt();
			if (w <= 0 || w > 100) {
				System.exit(0);
				;
			}
			int h = sc.nextInt();
			if (h <= 0 || h > 100) {
				System.exit(0);
				;
			}
			int x = sc.nextInt();
			if (x < -100 || x > 100) {
				System.exit(0);
				;
			}

			int y = sc.nextInt();
			if (y < -100 || y > 100) {
				System.exit(0);
				;
			}
			int r = sc.nextInt();
			if (r <= 0 || r > 100) {
				System.exit(0);
				;
			}

			if (x - r < 0 || x + r > w) {
				System.out.println("No");
			} else if (y - r < 0 || y + r > h) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}