import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		String a = sc.next();
		String b = sc.next();
		String c = a + b;
		int d = Integer.parseInt(c);
		String ans = "";

		if (Math.sqrt(d)%1==0) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		// 出力
		System.out.println(ans);
	}
}
