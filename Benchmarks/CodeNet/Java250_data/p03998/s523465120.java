import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		char ans = 'a';
		
		int inta = 0;
		int intb = 0;
		int intc = 0;
		
		while(ans == 'a' && inta < a.length() || ans == 'b' && intb < b.length() || ans == 'c' && intc < c.length()) {
			switch(ans) {
				case 'a':
					ans = a.charAt(inta);
					inta++;
					break;
				case 'b':
					ans = b.charAt(intb);
					intb++;
					break;
				case 'c':
					ans = c.charAt(intc);
					intc++;
					break;
 			}
		}
		System.out.println(Character.toUpperCase(ans));
	}
}
