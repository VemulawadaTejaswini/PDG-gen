import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X  = keyboard.nextInt();
		int Y  = keyboard.nextInt();

		int turu = 2;
		int kame = 4;
		
		String ans = "No";
		
		for(int i=0; i<X+1; i++) {
			if(i*turu + (X-i)*kame == Y) {
				ans = "Yes";
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
