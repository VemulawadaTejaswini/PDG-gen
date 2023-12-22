import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.length() != 6) {
			System.out.println("No");
			return;
		}
		if(s.charAt(2) != s.charAt(3)) {
			System.out.println("No");
			return; 
		}
		if(s.charAt(4) != s.charAt(5)) {
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
	}

}