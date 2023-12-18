import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		String S = sn.next();
		String T = sn.next();
		
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		
		int cnt = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == t[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
}
