import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		
		int ans = 0;
		
		if(S.charAt(1) == 'S') {
				if(S.charAt(0) == 'R' || S.charAt(2) == 'R') {
					ans++;
			}
		}else {
			if(S.charAt(0) == 'R') {
				ans++;
			}
			if(S.charAt(1) == 'R') {
				ans++;
			}
			if(S.charAt(2) == 'R') {
				ans++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}