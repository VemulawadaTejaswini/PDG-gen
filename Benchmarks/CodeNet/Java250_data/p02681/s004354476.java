import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			String t = sc.next();
			
			if ( s.length() + 1 == t.length() && 
					t.substring(0, s.length()).contentEquals(s)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
				
		}
	}

}