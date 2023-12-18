import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		String t = T.substring(0, S.length());

		if(S.equals(t)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
