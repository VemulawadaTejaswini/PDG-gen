import java.util.Scanner;
//B - 文字列大好きいろはちゃんイージー / Iroha Loves Strings (ABC Edition)

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next(); //文字列ｓを標準入力する
		
		int cnt = 0;

		for (char c = 'a' ; c <= 'z'; c++) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
	                cnt ++;
				}
			}
			if (cnt % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
