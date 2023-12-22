import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		String t = stdIn.next();
		
		boolean ans = false;
		
		
		for(int i = 0; i < s.length(); i++) {
			if(s.equals(t)) {
				ans = true;
				break;
			}
			s = s.substring(s.length()-1)+s.substring(0,s.length()-1);
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
