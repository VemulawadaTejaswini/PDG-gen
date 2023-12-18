import java.util.Scanner;

public class Main {
	long day(int y, int m, int d) {
		long res = 0;
		for (int i = 1; i < y; i++) {
			if (i % 3 == 0) {
				res += 20 * 10;
			} else {
				res += 20 * 5 + 19 * 5;
			}
		}
		for (int i = 1; i < m; i++) {
			if (y % 3 == 0) {
				res += 20;
			} else {
				if (i % 2 == 0) {
					res += 19;
				} else {
					res += 20;
				}
			}
		}
		res += d;
		return res;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long m = day(1000, 1, 1);
		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			long a = day(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println(m - a);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}