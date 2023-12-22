import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		int ans = 0;
		int len = s.length() / 2;
		int i;
		for(i = 0; i < len; i++) {
			if(!s.substring(i, i + 1).equals(s.substring(s.length() - 1 - i, s.length() - i))) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}