import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A= keyboard.nextInt();
		int B= keyboard.nextInt();
		
		String ans = ":(";
		
		if(A <=8 && B<=8) {
			ans = "Yay!";
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}