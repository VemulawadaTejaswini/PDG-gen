import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int S = scan.nextInt();
			int W = scan.nextInt();
			System.out.println(W>=S?"unsafe":"safe");
		}
		
		
	}
		

}
