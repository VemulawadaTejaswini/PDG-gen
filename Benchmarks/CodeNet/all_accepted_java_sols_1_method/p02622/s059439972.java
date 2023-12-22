import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String t = scan.next();
		int ans = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != t.charAt(i)) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
	}
}
 
