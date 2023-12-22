import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int R = scan.nextInt();
			
			double a = 2.0*(double)R*3.1415926535897;
			
			System.out.println(a);
			
		}
		
		
	}
		

}
