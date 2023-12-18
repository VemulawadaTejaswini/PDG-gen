import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		
		if (a.charAt(0) == b.charAt(2) && a.charAt(1) == b.charAt(1) && a.charAt(2) == b.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}