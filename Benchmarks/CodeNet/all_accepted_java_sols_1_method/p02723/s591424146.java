import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int b = 0;
		if (s.charAt(2) == s.charAt(3)) {
			b++;
		}
		if (s.charAt(4) == s.charAt(5)) {
			b++;
		}
		if (b == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
