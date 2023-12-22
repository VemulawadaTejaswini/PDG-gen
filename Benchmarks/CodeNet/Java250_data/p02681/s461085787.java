import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		String ans = (t.substring(0, t.length() - 1).equals(s)) ? "Yes" : "No";
		System.out.println(ans);
	}

}
