import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str = str + "x";
		}

		System.out.println(str);

	}

}