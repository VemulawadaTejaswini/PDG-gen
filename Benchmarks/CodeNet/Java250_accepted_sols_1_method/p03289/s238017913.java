
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();

		if(!S.startsWith("A")) {
			System.out.println("WA");
			return;
		}
		if(S.substring(2, S.length()-1).indexOf("C")<0) {
			System.out.println("WA");
			return;
		}
		String s = S.toLowerCase();
		int w = 0;
		for(int i=0; i<s.length(); i++) {
			if(S.charAt(i) != s.charAt(i)) {
				w++;
			}
		}
		if(w==2) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}

}
