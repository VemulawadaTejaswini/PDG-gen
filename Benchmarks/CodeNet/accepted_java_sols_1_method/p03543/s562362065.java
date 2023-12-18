import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
			System.out.println("Yes");
		} else if (s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}