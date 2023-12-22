import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flagA = false, flagC = false, flagL = true;
		int n = 0;
		if(s.charAt(0) == 'A') flagA = true;
		for(int i = 2; i < s.length() - 1; i++) {
			if(flagC && s.charAt(i) == 'C') {
				flagC = false;
				break;
			} else if(s.charAt(i) == 'C') {
				flagC = true;
				n = i;
			}
		}
		for(int i = 1; i < s.length(); i++) {
			if(i != n && Character.isUpperCase(s.charAt(i))) flagL = false;
		}
		if(flagA && flagC && flagL) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}