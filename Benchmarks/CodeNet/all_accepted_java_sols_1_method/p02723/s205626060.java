import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			char[] s = new char[6];
			
			s = S.toCharArray();
			
			if(s[2]==s[3]&&s[4]==s[5]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			
			
		}
		
		
	}
		

}
