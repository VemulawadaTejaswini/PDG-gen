
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		boolean ans = false;
		for(int i = 0; i < s.length(); i++) {
			ans = ans || (c != s.charAt(i));
		}
		System.out.println(ans ? "Yes" : "No");

	}

}
