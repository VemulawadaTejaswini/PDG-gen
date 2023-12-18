import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		String S = sc.next();

		int N = S.length();

		if (S.substring(0, (N - 1) / 2).equals(S.substring((N + 1) / 2, N))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}