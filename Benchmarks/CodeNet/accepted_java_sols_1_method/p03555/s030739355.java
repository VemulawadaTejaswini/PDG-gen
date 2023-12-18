import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c1 = scan.next();
		String c2 = scan.next();
		String message = "NO";
		if((c1.charAt(0) == c2.charAt(2)) &&
				(c1.charAt(1) == c2.charAt(1)) &&
				(c1.charAt(2) == c2.charAt(0))) {
			message = "YES";
		} 
		System.out.println(message);
	}
}