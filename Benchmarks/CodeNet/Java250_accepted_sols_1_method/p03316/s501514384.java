
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		int a = 0;
		char[] c;
		c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			a = a + Character.getNumericValue(c[i]);
		}
		int in = Integer.parseInt(s);
		if (in % a == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
