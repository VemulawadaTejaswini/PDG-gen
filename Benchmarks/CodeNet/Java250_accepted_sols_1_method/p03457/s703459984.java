import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean canArrive = true;
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int t1 = 0, t2;
			int x1 = 0, x2;
			int y1 = 0, y2;

			for (int i = 0; i < n; i++) {
				t2 = scanner.nextInt();
				x2 = scanner.nextInt();
				y2 = scanner.nextInt();

				int time = t2 - t1;
				int distance = Math.abs(x2 - x1 + y2  - y1);
				if (distance > time || (distance ^ time & 1) == 1) {
					canArrive = false;
					break;
				}

				t1 = t2;
				x1 = x2;
				y1 = y2;
			}
		}

		if (canArrive) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}