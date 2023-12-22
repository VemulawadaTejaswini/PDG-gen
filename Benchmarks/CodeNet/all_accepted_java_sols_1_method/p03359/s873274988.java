import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// 整数の入力
		// int a = sc.nextInt();
		// スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// 文字列の入力
		// String s = sc.next();
		// 出力
		// System.out11.println((a+b+c) + " " + s);

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();

		int count = 0;
		for (int i = 1; i < month; i++) {
			count++;
		}

		if (month <= day) {
			count++;
		}

		System.out.println(count);


	}

}