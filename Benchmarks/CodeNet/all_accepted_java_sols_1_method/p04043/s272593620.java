import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String abc = "" + a + b + c;

		String ans = "NO";

		if (a + b + c == 17) {
			if (abc.contains("7") && abc.contains("5")) {
				ans = "YES";
			}
		}

		System.out.println(ans);
	}

}
