import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if((char)s.charAt(1)=='B') {
			System.out.println("ARC");
		}else {
			System.out.println("ABC");
		}
		
	}
}