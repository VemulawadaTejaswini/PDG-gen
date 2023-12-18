import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;
		for (int i = 2; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'C') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("WA");
			return;
		}
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
				count++;
			}
		}
		if (count != 2) {
			System.out.println("WA");
		} else {
			System.out.println("AC");
		}
	}
}
