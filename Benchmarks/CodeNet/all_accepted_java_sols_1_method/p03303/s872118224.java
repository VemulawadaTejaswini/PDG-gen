import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String s = sc1.next();
		int w = sc1.nextInt();
		String ans = "";

		for ( int i = 0 ; i < s.length() ; i += w) {
			ans += s.charAt(i);
		}

		System.out.println(ans);

		sc1.close();
	}

}