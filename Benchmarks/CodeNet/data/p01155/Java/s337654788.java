import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((a | b) == 0)
				break;
			int min = INF;
			for (int i = 1; i * i <= a; i++) {
				if (a % i != 0)
					continue;
				for (int j = 1; j * j <= b; j++) {
					if (b % j != 0)
						continue;
					int[] ns = { i, a / i, j, b / j };
					Arrays.sort(ns);
					min = Math.min(min, (ns[1] - ns[0]) * (ns[1] - ns[0])
							+ (ns[2] - ns[1]) * (ns[2] - ns[1])
							+ (ns[3] - ns[2]) * (ns[3] - ns[2]));
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}