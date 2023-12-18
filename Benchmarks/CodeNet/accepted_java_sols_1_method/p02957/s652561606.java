import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		double A  = keyboard.nextInt();
		double B  = keyboard.nextInt();
		
		if(((A+B)/2) % 1 == 0.0) {
			System.out.println((int)(A+B)/2);
		}else{
			System.out.println("IMPOSSIBLE");
		}
		keyboard.close();	
	}
}