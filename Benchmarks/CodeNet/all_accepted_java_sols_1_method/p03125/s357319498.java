import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result;

		if (b % a == 0)
			result = a + b;
		else
			result = b - a;

		// 出力
		System.out.println(result);
	}
}