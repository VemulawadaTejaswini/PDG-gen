import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String coffee = scan.nextLine();
		
		if(coffee.charAt(4) == coffee.charAt(5) && coffee.charAt(2) == coffee.charAt(3)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
			
		}
		
		
	}
	
}
