import java.util.Scanner;

public class Main {
	public static void main(String[]args) {//A ~Z 65~90
		
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			String S = scan.next();
			char []s = new char[N];
			s = S.toCharArray();
			
			 
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0;i<S.length();i++) {
				int k = (int)s[i]+N;
				if(k>90) {
					k = (k-90)+64;
				}
				
				s[i] = (char)k;
				sb.append(s[i]);
			}
			
			
			System.out.println(sb.toString());
			
			
			
			
		}
		
		
		
		
	}
	
}
