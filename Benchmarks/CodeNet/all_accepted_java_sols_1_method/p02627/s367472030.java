import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String alpha = sc.next();
			
			if ( alpha.toLowerCase().contentEquals(alpha)) {
				System.out.println("a");
			}
			else {
				System.out.println("A");
			}
				
		}
	}

}