import java.util.Scanner;

public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		String  s = scan.next();
		String  t = scan.next();
		String ans = "No";

		if(s.length() + 1 == t.length() ) {
			if(s.equals(t.substring(0 ,s.length()))) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}