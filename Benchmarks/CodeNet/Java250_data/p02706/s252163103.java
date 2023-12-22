import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X  = keyboard.nextInt();
		int Y  = keyboard.nextInt();
		
		int HW = 0;
		
		for(int i=0; i<Y; i++) {
			HW += keyboard.nextInt();
		}
		
		int P = -1;
		if(X - HW >= 0) {
			P = X - HW;
		}
		
		System.out.println(P);
		keyboard.close();	
	}
}
