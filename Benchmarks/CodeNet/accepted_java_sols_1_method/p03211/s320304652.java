
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int ans = 1000;
		
		for (int i = 0; i + 2 < s.length(); i++) {
			ans = Math.min(ans, Math.abs(753 - Integer.parseInt(s.substring(i, i + 3))));
		}
		
		System.out.println(ans);
		
	}
	
}
