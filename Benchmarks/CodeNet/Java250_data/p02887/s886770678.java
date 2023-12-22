import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			String s = sc.next();
			
			int result = 1;
			
			char current = s.charAt(0);
			
			for(int i = 1 ; i < n ; i++ ) {
				if ( current != s.charAt(i)) {
					result++;
					current = s.charAt(i);
				}
			}
			
			
			System.out.println(result);
			
		}
	}
}

