import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String T = stdIn.next();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		int count = 0;
		
		for(int i = 0 ; i < 3; i++) {
			if(s[i] == t[i]) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}