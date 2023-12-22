import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X = keyboard.nextInt();
		
		System.out.println((X/500)*1000 + ((X%500)/5)*5);
		keyboard.close();	
	}
}