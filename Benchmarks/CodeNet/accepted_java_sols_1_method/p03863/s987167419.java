import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		if (s.charAt(0) == s.charAt(N-1)) {
			if (N%2 == 0) System.out.println("First");
			else System.out.println("Second");
		} else {
			if (N%2 == 0) System.out.println("Second");
			else System.out.println("First");
		}
	}
}