
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.nextLine();
		String e = sc.nextLine();
		int n = o.length() + e.length();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				//文字列oからi番目
				System.out.print(o.charAt(i / 2));
			} else {
				System.out.print(e.charAt(i / 2));
			}
		}
		System.out.println("");
	}
}
