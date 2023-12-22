import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String[] s = S.split("S");
		int ans = 0;
		for(int i = 0; i < s.length; i ++) {
			ans = Math.max(ans, s[i].length());
		}
		
		System.out.println(ans);
	}
}