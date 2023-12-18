import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int min = 1 << 20;
			for (int z = 0; z <= n; z++) {
				if (n < z * z * z) break;
				for (int y = 0; y <= n; y++) {
					if (n < y * y + z * z * z) break;
					int x = n - y*y - z*z*z;
					if (x < 0) break;
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