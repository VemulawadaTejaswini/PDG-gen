import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		String N = scan.next();

		String ans = "s";

		if (N.substring(N.length() - 1).equals("s")) {
			ans = "es";
		}

		//結果出力
		System.out.println(N + ans);
	}
}