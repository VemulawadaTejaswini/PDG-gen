import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char cash = s.charAt(0);
		int ans = 0;
		for(char c: s.toCharArray()) {
			if(c!=cash) {
				ans++;
				cash = c;
			}
		}
		System.out.println(ans);
	}
}