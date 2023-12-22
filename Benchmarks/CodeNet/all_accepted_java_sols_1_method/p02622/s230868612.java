import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			String S = scan.next();
			String T = scan.next();
			
			char[]s = new char[S.length()];
			s = S.toCharArray();
			char[]t = new char[S.length()];
			t = T.toCharArray();
			
			int count = 0;
			
			
			for(int i = 0;i<S.length();i++) {
				if(s[i]!=t[i])count++;
			}
			
			System.out.println(count);
			
			
		}
		
		
	}
		

	
}
