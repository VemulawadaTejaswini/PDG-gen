import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		String ans = "No";
		if(n % 2 == 0) {
			if(s.substring(0,n/2).equals(s.substring(n/2))) {
				ans = "Yes";
			}
		}
		System.out.print(ans);

	}
}