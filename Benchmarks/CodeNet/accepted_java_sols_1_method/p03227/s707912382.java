import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if (s.length() == 2) {
			System.out.println(s);
			return;
		} else {
			for (int i = 2; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}
	}
}
