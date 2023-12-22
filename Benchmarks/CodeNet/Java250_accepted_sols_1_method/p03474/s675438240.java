
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		
		boolean flg = true;
		
		if (!s.substring(0, a).matches("[0-9]{" + a + "}")) {
			flg = false;
		}
		
		if (!s.substring(a, a + 1).equals("-")) {
			flg = false;
		}
		
		if (!s.substring(a + 1).matches("[0-9]{" + b + "}")) {
			flg = false;
		}
		
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
