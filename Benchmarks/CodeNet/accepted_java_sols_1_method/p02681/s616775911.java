import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		String T_changed = T.substring(0,T.length()-1);

		if(T_changed.equals(S)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
