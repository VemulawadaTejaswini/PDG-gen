

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			String S = scan.next();
			String T = scan.next();
			
			String t = T.substring(0, T.length()-1);
			
			
			System.out.println(S.equals(t)?"Yes":"No");
			
		}
		
		
	}
		

}
