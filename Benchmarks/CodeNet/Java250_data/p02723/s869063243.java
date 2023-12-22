

import java.util.*;

public class Main {
	static boolean f;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[] s_char = s.toCharArray();
		
		if(s_char[2]==s_char[3]) {
			if(s_char[4]==s_char[5])
				f = true;
		}
		
		if(f)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
