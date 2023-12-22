

import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();	
		String T = keyboard.next();	
		
		int Slong = S.length();
		
		int count = 0;
		for (int i=0; i<Slong; i++) {
			if(S.charAt(i) == T.charAt(i)) {
				
			}else {
				count++;
			}
		}
					
							
		System.out.println(count);
		keyboard.close();	
	}
}




