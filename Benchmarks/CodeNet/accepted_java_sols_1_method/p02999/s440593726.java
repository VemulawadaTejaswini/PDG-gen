import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int X = keyboard.nextInt();
		int A = keyboard.nextInt();
		
		if(X < A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
		keyboard.close();	
	}
}
