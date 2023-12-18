import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
 		int l = s.length();
 		int ans = l;
		for(int i = 1; i < l; i++) {
			if(chars[i-1]!=chars[i]) {
				ans = Math.min(ans, Math.max(i, l - i));
			}
		}
		System.out.println(ans);
	}
}