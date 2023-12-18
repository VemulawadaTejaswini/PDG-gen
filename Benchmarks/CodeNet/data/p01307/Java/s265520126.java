import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int i = 0; i < TC; i++) {
			read();
			solve();
		}
	}
	
	static String S = "";
	static boolean read() {
		S = sc.next();
		return true;
	}

	static void solve() {
		int cnt = 0;
		while (S.length() != 1) {
			cnt++;
			int a = Integer.parseInt(new Character(S.charAt(0)).toString());
			int b = Integer.parseInt(new Character(S.charAt(1)).toString());
			S = new Integer(a + b).toString() + S.substring(2);
		}
		if (cnt % 2 == 0) {
			System.out.println("Audrey wins.");
		} else {
			System.out.println("Fabre wins.");
		}
	}	
}