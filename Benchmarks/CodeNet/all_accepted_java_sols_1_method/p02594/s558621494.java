import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			if(X>=30)System.out.println("Yes");
			else System.out.println("No");
			
		}
		
		
	}
		

}
