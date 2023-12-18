import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int MAX = 1_000_000;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int min = 1 << 20;
			for (int z = 0; z * z * z <= MAX; z++) {
				for (int y = 0; y * y + z * z * z <= MAX; y++) {
					int x = n - y*y - z*z*z;
					if (x < 0) continue;
					min = Math.min(min, x + y + z);
				}
			}

			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}