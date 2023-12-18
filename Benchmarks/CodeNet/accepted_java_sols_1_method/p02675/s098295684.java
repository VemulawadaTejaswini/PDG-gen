import java.util.Scanner;

public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		String  n = scan.next();
		String ans = null;

		String temp = n.substring(n.length()-1);
		int num = Integer.parseInt(temp);
		if(num == 3) {
			ans = "bon";
		} else if(num == 0 || num == 1 || num == 6 || num == 8) {
			ans = "pon";
		} else {
			ans = "hon";
		}
		System.out.println(ans);
	}
}