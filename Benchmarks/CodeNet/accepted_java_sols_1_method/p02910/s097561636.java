
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = true;
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0 && s.charAt(i) == 'L') {
				ans = false;
			} else if(i % 2 == 1 && s.charAt(i) == 'R') {
				ans = false;
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
