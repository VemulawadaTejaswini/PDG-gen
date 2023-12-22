import java.util.Scanner;

// https://atcoder.jp/contests/abc168/tasks/abc168_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();


		int len = n.length();
		n = n.substring(len-1, len);

		if(n.equals("3")) {
			System.out.println("bon");
		}else if(n.equals("0")||n.equals("1")||n.equals("6")||n.equals("8")) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}
