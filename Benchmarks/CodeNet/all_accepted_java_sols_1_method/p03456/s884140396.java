import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		a += b;
		
		int s = Integer.parseInt(a);
		
		System.out.println((Math.sqrt(s) == (int)Math.sqrt(s)) ? "Yes" : "No");
		
	}

}