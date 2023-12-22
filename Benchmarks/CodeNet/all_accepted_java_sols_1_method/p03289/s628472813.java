
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if (s.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		
		int cnt = 0, c = 0;
		for (int i = 2; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'C') {
				cnt++;
				c = i;
			}
		}
		if (cnt != 1) {
			System.out.println("WA");
			return;
		}
		
		for (int i = 1; i < s.length(); i++) {
			if (i == c) continue;
			if ((int)s.charAt(i) <= 90) {
				System.out.println("WA");
				return;
			}
		}
		
		System.out.println("AC");
		
	}

}
