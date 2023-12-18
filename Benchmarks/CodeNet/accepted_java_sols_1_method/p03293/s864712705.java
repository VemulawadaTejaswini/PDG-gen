
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		
		String ans = "No";
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(s.length() - 1, s.length()) + s.substring(0, s.length() - 1); 
			
			if (s.equals(t)) {
				ans = "Yes";
				break;
			}
		}
		
		System.out.println(ans);
		
	}
}