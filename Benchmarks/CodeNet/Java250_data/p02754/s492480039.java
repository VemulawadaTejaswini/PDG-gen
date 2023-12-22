import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		long n = getLong(sc);
		long a = getLong(sc);
		long b = getLong(sc);

		long blueBall = 0;
		blueBall += n / (a + b)*a;
		n = n % (a + b);
		if (n < a) {
			blueBall += n;
		} else {
			blueBall += a;
		}
		System.out.println(blueBall);
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

}
