
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		int cntA = 0;
		int cntB = -1;
		int cntC = -1;
		
		char next = a.charAt(0);
		String ans = "";
		outside: do {
			
			switch (next) {
			case 'a':
				cntA++;
				if (cntA == a.length()) {
					ans = "A";
					break outside;
				}
				next = a.charAt(cntA);
				break;
			case 'b':
				cntB++;
				if (cntB == b.length()) {
					ans = "B";
					break outside;
				}
				next = b.charAt(cntB);
				break;
			case 'c':
				cntC++;
				if (cntC == c.length()) {
					ans = "C";
					break outside;
				}
				next = c.charAt(cntC);
				break;
			
			}
		} while(true);

		System.out.println(ans);
		
	}
}