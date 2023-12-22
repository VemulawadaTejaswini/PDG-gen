//B
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		String T = in.next();
		int count = 0;
		
		for(int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);
			
			if(s != t) {
				count++;
			}
		}

		System.out.println(count);
	}
}