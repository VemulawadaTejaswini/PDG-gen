import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	void run() {
		int map[][] = new int[201][17];

		for (int i = 0; i < 201; i++) {
			for (int m = 2; m <= 16; m++) {
				String a = Integer.toString(i, m);
				boolean ok = true;
				for (char c : a.toCharArray()) {
					ok = Character.isDigit(c);
					if (!ok) {
						break;
					}
				}
				if (ok) {
					map[i][m] = Integer.valueOf(a);
				} else {
					map[i][m] = Integer.MAX_VALUE;
				}
			}
		}

		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if ((a & b & c) == -1) {
				break;
			}

			int now = b;

			boolean ok = false;
			for (int m = 2; m < 17; m++) {
				if (map[a][m] == b) {
					ok = true;
					break;
				}
			}

			if (!ok) {
				System.out.println(-1);
				continue;
			}

			for (int i = a + 1; i <= c; i++) {
				int next = Integer.MAX_VALUE;
				for (int m = 2; m < 17; m++) {
					if (map[i][m] >= now) {
						next = Math.min(next, map[i][m]);
					}
				}
//				System.out.println(i+" "+next);
				now = next;
			}
			if (now == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(now);
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}