import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String ans = "";

		if (S.equals("ABC")) {
			ans = "ARC";
		} else {
			ans = "ABC";
		}

		// 出力
		System.out.println(ans);
	}
}