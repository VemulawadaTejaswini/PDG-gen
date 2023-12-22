import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String ans = "No";
		if(n.contains("7")) {
			ans = "Yes";
		}

		System.out.println(ans);
	}
}