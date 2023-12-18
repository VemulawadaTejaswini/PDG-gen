package vol025;

import java.util.Scanner;

public class Main{

	Scanner sc = new Scanner(System.in);
	String a;

	void run() {
		a = sc.next();
		int cnt = 0;
		int A, B;

		for (int i = 0; i < a.length(); i++) {

			if (i != 0) {
				A = Integer.valueOf(a.substring(0, i));
			} else {
				A = 0;
			}
			B = Integer.valueOf(a.substring(i, a.length()));
			if (check(A, B)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	boolean check(int A, int B) {
		boolean judge = false;
		int x, y, res;

		if ((A + B) % 2 == 0 && (A - B) % 2 == 0) {
			x = (A + B) / 2;
			y = -(A - B) / 2;
			A = x - y;
			B = x + y;
			res = Integer.valueOf(A + "" + B);
			if (res == Integer.valueOf(a) && x >= 0 && y >= 0) {
				judge = true;
			}
		}
		return judge;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}