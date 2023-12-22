import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		char[] sChars = s.toCharArray();
		String t  = sc.nextLine();
		char[] tChars = t.toCharArray();
		int max = 0;
		
		for(int i = 0; i <= s.length() - t.length(); i++) {
			
			int matchChar = 0;
			for(int j = 0; j < t.length(); j++) {
				if(tChars[j] == sChars[i+j]) {
						matchChar++;
				}
			}

			if(max < matchChar) {
				max = matchChar;
			}
			
		}


		System.out.println(t.length() - max);
		sc.close();
	}
}


