import java.util.*;

public class Main {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		final int a = sc.nextInt();
		final int b = sc.nextInt();

		if (a % 2 != 0 && b % 2 != 0) {
			// 奇数
			System.out.println("Odd");

		} else {
			// 偶数
			System.out.println("Even");
		}
	}
}