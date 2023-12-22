import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String p = sc.next();
		String c;
		int flag = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(i + p.length() <= s.length()){
				c = s.substring(i, p.length() + i);
			} else {
				c = s.substring(i, s.length()) + s.substring(0, p.length() - (s.length() - i));
			}
			
			if(c.equals(p)) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}