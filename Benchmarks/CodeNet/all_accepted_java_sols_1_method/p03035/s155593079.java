import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		// 年齢
		int A = sc.nextInt();

		// 通常の値段
		int B = sc.nextInt();

		// 年齢が0～5歳の場合0円
		if (0 <= A && A <= 5) {
			System.out.print(0);
			// 6～12歳の場合半額
		} else if (6 <= A && A <= 12) {
			System.out.print(B / 2);
			// 13歳以上は通常
		} else if (13 <= A) {
			System.out.print(B);
		}
	}
}