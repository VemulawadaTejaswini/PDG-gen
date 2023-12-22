import java.util.Scanner;

// https://atcoder.jp/contests/abc162/tasks/abc162_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		String str = n.replace("7", "");

		if(str.length()!=3) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
