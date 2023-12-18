

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			long a = sc.nextInt();
			long b = sc.nextInt();

			long c = gcd(a, b);

			long d = a * b / c;

			System.out.println(c + " " + d);
		}
		sc.close();
	}

	// 最大公約数
	// ユークリッドの互除法
	public long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}