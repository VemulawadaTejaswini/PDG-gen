import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String ans = "Yes";
		sc.close();
		while (true) {
			if (c-b <= 0) {
				break;
			} else {
				c -= b;
			}
			if (a-d <= 0) {
				ans = "No";
				break;
			} else {
				a -= d;
			}

		}
		System.out.println(ans);

	}

}