import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			String s = sc.next();
			
			if ( n % 2 != 0 ) {
				System.out.println("No");
				return;
			}
			
			boolean isMatch = true;
			for(int i = 0 ; i < n / 2 ; i++ ) {
				if ( s.charAt(i) != s.charAt(n/2 + i) ) {
					isMatch = false;
				}
			}
			
			System.out.println(isMatch ? "Yes" : "No");
			
		}
	}
}
