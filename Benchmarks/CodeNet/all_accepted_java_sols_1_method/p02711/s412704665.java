import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String n = sc.next();
			
			for(int i = 0 ; i < n.length() ; i++ ) {
				if ( n.charAt(i) == '7') {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
	}

}