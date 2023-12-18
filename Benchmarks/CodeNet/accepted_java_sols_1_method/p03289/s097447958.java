import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		if (S.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		
		int count = 0;
		for (int i = 2; i < S.length() - 1; i++) {
			if (S.charAt(i) == 'C') 
				count++;
		}
		
		if (count != 1) {
			System.out.println("WA");
			return;
		}
		
		for (int i = 1; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c != 'C' && S.charAt(i) != Character.toLowerCase(S.charAt(i))) {
				System.out.println("WA");
				return;
			}
		}
		
		System.out.println("AC");
	}
}