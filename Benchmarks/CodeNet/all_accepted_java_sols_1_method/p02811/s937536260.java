import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int x = scan.nextInt();     	
		String ans = "No";
		
		if(x <= 500 * k) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}