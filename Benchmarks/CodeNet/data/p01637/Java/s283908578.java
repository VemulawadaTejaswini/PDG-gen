import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		long M = sc.nextLong();
		long rd = sc.nextLong();
		long rr = sc.nextLong();
		long cd = sc.nextLong();
		long cr = sc.nextLong();
		long r = 0;
		long l = 1000L * 1000L * 1000L * 1000L + 1;
		for (int i = 0; i < 1000; i++) {
			long mid = (r + l) / 2;
			if (mid >= 1.0 * 100 * cd / rd) {
				l = mid;
			} else {
				r = mid;
			}
		}
		long x = l;
		r = 0;
		l = M;
		for (int i = 0; i < 1000; i++) {
			long mid = (r + l) / 2;
			if (mid >= 1.0 * 100 * cr / rr) {
				l = mid;
			} else {
				r = mid;
			}
		}
		long y = l;
		if (x + y > M) {
			System.out.println(-1);
		} else {
			long D = rd * x / 100;
			long R = rr * y / 100;
			System.out.println(100 * (D - cd) / rd + 100 * (R - cr) / rr + M
					- x - y);
		}
	}
}