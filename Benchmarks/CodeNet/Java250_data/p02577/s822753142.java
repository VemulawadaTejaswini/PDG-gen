
import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int sum = 0;
		String ans = "No";
		
		for(int i = 0; i < n.length(); i++) {
			sum += Integer.parseInt(n.substring(i, i+1));
		}
		
		if(sum % 9 == 0 ) {
			ans = "Yes";
		}

		System.out.print(ans);
	}
}