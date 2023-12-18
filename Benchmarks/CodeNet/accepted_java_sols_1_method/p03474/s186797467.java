import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (i == a) continue;
			
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				
				System.out.println("No");
				return;
				
			}
			
		}
		
		System.out.println((s.charAt(a) == '-') ? "Yes" : "No");
		
	}

}