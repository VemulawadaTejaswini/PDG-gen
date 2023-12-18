
import java.util.*;
public class main_214865 {
	public static void main ( String [] args) {
		Scanner input = new Scanner (System.in);
		String s = input.next();
		String t = input.next();
		boolean f = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				f= false;
				break;
			}
			
		}
		if (f) {
			System.out.println("Yes");	
		}
		else {
			System.out.println("no");
		}
	}

}
