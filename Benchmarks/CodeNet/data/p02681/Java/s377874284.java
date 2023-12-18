import java.util.Scanner;

// https://atcoder.jp/contests/abc167/tasks/abc167_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();


		String aa = t.replace(s, "");
		if(1>=aa.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
