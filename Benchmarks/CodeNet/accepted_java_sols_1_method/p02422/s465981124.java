
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		StringBuilder str = new StringBuilder(sc.next());
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt() + 1;

			if (S.equals("print")) {
				System.out.println(str.substring(a, b));
			} else if (S.equals("reverse")) {
				str.replace(a, b, (new StringBuilder(str.substring(a, b))).reverse().toString());
			} else {
				String SS = sc.next();
				str.replace(a, b, SS);
			}
		}
	}
}

