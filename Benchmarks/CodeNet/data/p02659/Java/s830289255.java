import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		long A = keyboard.nextLong();
		String B = keyboard.next();
		
		long NB = 0;
		String nb = "";
		
		for(int b = 0;b<4; b++) {
			if( B.charAt(b)!= '.') {
				nb += B.charAt(b);
			}
		}
		NB = Integer.parseInt(nb);
		
		System.out.println(NB*A/100);
		keyboard.close();
	}
}