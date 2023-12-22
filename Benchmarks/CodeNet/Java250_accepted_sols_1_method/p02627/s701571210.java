import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String A = keyboard.next();	
		
		String OMOJI = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int Olong = OMOJI.length();
		
		String ans = "a";
		
		for (int i=0; i<Olong; i++) {
			if(OMOJI.charAt(i) == A.charAt(0)) {
				ans = "A";
			}
		}
										
		System.out.println(ans);
		keyboard.close();	
	}
}