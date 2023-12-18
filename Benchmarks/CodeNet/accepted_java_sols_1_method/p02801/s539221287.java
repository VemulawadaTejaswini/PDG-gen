import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.next();
		char c = string.charAt(0);
		int n = c;
		System.out.println((char)(n+1));
	}
}