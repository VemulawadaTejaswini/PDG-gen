import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String型をchar型へ変換
		char[] c = sc.nextLine().toCharArray();

		for (int i = 0; i < c.length; i++) {
			// 1文字ずつ大文字変換された文字と比較
			if (c[i] == Character.toUpperCase(c[i])) {
				c[i] = Character.toLowerCase(c[i]);
			} else {
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		// 出力
		System.out.println(c);
	}
}

