
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean ans = false;
		for(int i = 0; i < s.length(); i++) {
			if(s.equals(t)) {
				ans = true;
				break;
			}
			s += s.charAt(0);
			s = s.substring(1);
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
