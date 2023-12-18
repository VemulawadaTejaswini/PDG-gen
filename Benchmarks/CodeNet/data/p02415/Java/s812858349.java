

import java.util.Scanner;

abstract class Main {

	public static void main(String[] args) {

		// 標準入力
		Scanner sc = new Scanner(System.in);

		// char型に変換
		String words = sc.nextLine();
		char ch[] = words.toCharArray();

		// char型の数だけ回す
		for (int i = 0; i < ch.length; i++) {

			//
			if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}

		for (char chage : ch) {
			System.out.print(chage);
		}
		System.out.print("\n");
	}
}