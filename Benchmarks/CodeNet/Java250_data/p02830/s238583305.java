
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		String t = scan.next();
		
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans.concat(s.substring(i, i + 1)).concat(t.substring(i, i + 1));
		}
		
		System.out.println(ans);
	
	}
}