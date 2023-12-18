import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			String t = sc.next();
			
			
			char[] sChar = s.toCharArray();
			char[] tChar = t.toCharArray();
			
			int len = tChar.length;
			for(int i = 0 ; i < s.length() - t.length() + 1; i++ ) {
				
				int cLen = 0;
				for(int j = 0 ; j < t.length() ; j++ ) {
					if ( sChar[i+j] != tChar[j]) {
						cLen++;
					}
					
				}
				
				if ( cLen < len ) {
					len = cLen;
				}
			}
			
			System.out.println(len);
		
		}
	}

}