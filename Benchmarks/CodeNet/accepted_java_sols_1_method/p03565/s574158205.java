import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean non = false;
		int start = 0;
		if(s.length() < t.length()) {
			System.out.println("UNRESTORABLE");
			return;
		}
		outside : for(int i =  s.length() - t.length(); i >= 0; i--) {
			for(int j = 0; j < t.length(); j++) {
				if(!(s.charAt(i + j) == '?' || s.charAt(i + j) == t.charAt(j))) {
					break;
				}
				if(j == t.length() - 1) {
					start = i;
					break outside;
				}
			}
			if(i == 0) {
				non = true;
			}
		}
		if(non) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for(int i = 0; i < start; i++) {
			if(s.charAt(i) == '?') {
				System.out.print('a');
			} else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.print(t);
		for(int i = start + t.length(); i < s.length(); i++) {
			if(s.charAt(i) == '?') {
				System.out.print('a');
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
