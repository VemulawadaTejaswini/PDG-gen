import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			// 文字列の入力
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				int index = ALPHABETS.indexOf(s.charAt(i));
				sb.append(ALPHABETS.charAt((index + n) % 26));
			}
			System.out.println(sb);
		}
	}
}
