import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int index = 0; index < S.length(); index++) {
			String ch = S.substring(index, index + 1);
			String r = "R";
			String l = "L";
			if ((index + 1) % 2 == 0) {
				//偶数文字目の処理
				if (ch.equals(r)) {
					System.out.println("No");
					return;
				} else {
				}
			} else if ((index + 1) % 2 != 0) {
				//奇数文字目の処理
				if (ch.equals(l)) {
					System.out.println("No");
					return;
				} else {
				}
			}
		}
		System.out.println("Yes");
	}
}