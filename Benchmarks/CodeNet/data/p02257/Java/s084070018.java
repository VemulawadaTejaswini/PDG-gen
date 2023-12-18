import java.util.Scanner;
import java.lang.Math;

class Judge {

	/**
	   素数かどうかを判定します。
	   @param p 数字
	   @return 素数ならtrue,違うならfalse
	 */
	boolean isPrime(int p) {
		// pが2
		if (p == 2) {
			return true;
		}

		// pが2未満 または 偶数
		if (p < 2 || (p % 2) == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(p); i += 2) {
			if (p % i == 0) {
				return false;
			}
		}

		return true;
	}
}

class Main {

	public static void main(String[] args) {

		int num;
		int input;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		Judge j = new Judge();

		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			input = sc.nextInt();
			if(j.isPrime(input)) cnt++;
		}

		System.out.println(cnt);
	}
}

