import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(s.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		if(s.length() < 4) {
			System.out.println("WA");
			return;
		}
		String tmp = s.substring(2, s.length()-1);
		// System.out.println(tmp);
		if(tmp.replaceAll("C", "").length() != tmp.length() - 1) {
			System.out.println("WA");
			return;
		}
		if(s.replaceAll("C", "").length() != s.length() - 1) {
			System.out.println("WA");
			return;
		}
		for(char ch : s.toCharArray()) {
			if(ch == 'A' || ch == 'C') {
				continue;
			}
			if(!Character.isLowerCase(ch)) {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
	}
}
