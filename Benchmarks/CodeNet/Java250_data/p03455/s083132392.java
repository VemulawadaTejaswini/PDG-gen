import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt(); 
		int num2 = in.nextInt();
		
		int product = num1 * num2; 
		
		if ( (product & 1) == 0)  {
			System.out.println("Even");
		}
		
		else {
			System.out.println("Odd"); 
		}
	}

}
