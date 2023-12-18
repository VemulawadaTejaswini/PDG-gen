import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int h = s.nextInt();
		int n = s.nextInt();

		int x1 = 0;
		int x2 = w;
		int y1 = 0;
		int y2 = h;

		int i = 0;

		for (i = 0; i < n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			int a = s.nextInt();

			if (a == 1) {
				if (x1 > x) {
					x1 = x1;
				} else if (x1 <= x) {
					x1 = x;
				}

			} else if (a == 2) {
				if (x2 < x) {
					x2 = x2;
				} else if (x2 >= x) {

					x2 = x;
				}

			} else if (a == 3) {
				if (y1 > y) {
					y1 = y1;
				} else if (y1 <= y) {
					y1 = y;
				}

			} else if (a == 4) {
				if (y2 < y) {
					y2 = y2;
				} else if (y2 > y) {
					y2 = y;
				}

			}

		}
		if (x2 > x1 && y2 > y1) {
			System.out.println((x2 - x1) * (y2 - y1));

		} else {
			System.out.println("0");
		}

	}

}