import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		sc.close();
		int result = 0;

		// 処理
		if (400 <= x && x <= 599) {
			result = 8;
		} else if (600 <= x && x <= 799) {
			result = 7;
		} else if (800 <= x && x <= 999) {
			result = 6;
		} else if (1000 <= x && x <= 1199) {
			result = 5;
		} else if (1200 <= x && x <= 1399) {
			result = 4;
		} else if (1400 <= x && x <= 1599) {
			result = 3;
		} else if (1600 <= x && x <= 1799) {
			result = 2;
		} else if (1800 <= x && x <= 1999) {
			result = 1;
		}

		System.out.print(result);

	}

}
