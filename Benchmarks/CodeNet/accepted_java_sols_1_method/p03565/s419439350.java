import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sPrime = sc.next();
		String subString = sc.next();
		
		if (subString.length() > sPrime.length()) {
			System.out.println("UNRESTORABLE");
		} else {
			int startInd = 0;
			boolean works = false;
			for (int i = sPrime.length() - subString.length(); i >= 0; i--) {
				if (sPrime.charAt(i) == '?' || sPrime.charAt(i) == subString.charAt(0)) {
					works = true;
					for (int j = 0; j < subString.length(); j++) {
						if (!(sPrime.charAt(i + j) == '?' || sPrime.charAt(i + j) == subString.charAt(j))) {
							works = false;
						}
					}
				}
				if (works) {
					startInd = i;
					break;
				}
			}
			if (!works) {
				System.out.println("UNRESTORABLE");
			} else {
				String newString = "";
				for (int i = 0; i < sPrime.length(); i++) {
					if (i >= startInd && i < startInd + subString.length()) {
						newString += subString.charAt(i - startInd);
					} else if (sPrime.charAt(i) == '?') {
						newString += 'a';
					} else {
						newString += sPrime.charAt(i);
					}
				}
				System.out.println(newString);
			}
		}
	}
}
