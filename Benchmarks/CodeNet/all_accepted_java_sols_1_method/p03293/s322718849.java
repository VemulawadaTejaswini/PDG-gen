import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		String t = sc.next();
		
		boolean ans = true;
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			ans = true;
			for(int j = 0; j < len; j++) {
				if(s.charAt((i + j) % len) != t.charAt(j)) {
					ans = false;
					break;
				}
			}
			if(ans) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
    }
}
