import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		String message = "NO";
		if(a.endsWith(b.charAt(0) + "")) {
			if(b.endsWith(c.charAt(0) + "")) {
				message = "YES";
			}
		}
		System.out.println(message);
	}
}