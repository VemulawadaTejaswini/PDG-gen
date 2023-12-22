import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A  = keyboard.nextInt();
		int P  = keyboard.nextInt();
        
		System.out.println((A*3 + P)/2);
		keyboard.close();	
	}
}
