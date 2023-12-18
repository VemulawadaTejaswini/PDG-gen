import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String S0 = S.substring(0, S.length()/2);
		String S1 = S.substring((S.length()+3)/2-1);
		//System.out.println(S0+"  "+S1);
		boolean ans = true;
		for (int i = 0; i < S.length()/2; i++) {
			if (S.charAt(i) != S.charAt(S.length()-1-i)) {
				ans = false;
				break;
			}
		}

		for (int i = 0; i < (S0.length()-1)/2; i++) {
			if (S.charAt(i) != S.charAt(S0.length()-1-i))
				ans = false;
		}

		for (int i = 0; i < S1.length(); i++) {
			if (S.charAt(i) != S.charAt(S1.length()-1-i))
				ans = false;
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}