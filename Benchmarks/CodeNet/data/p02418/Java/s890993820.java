
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String p = sc.next();

		String ss = s + s;

		if(ss.contains(p)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

