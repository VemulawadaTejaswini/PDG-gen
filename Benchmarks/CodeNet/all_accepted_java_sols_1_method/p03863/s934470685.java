import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String s;
	public static void main(final String[] args) {
		s = sc.next();
		int N = s.length();
		if (s.charAt(0)==s.charAt(N-1)) {
			if (N%2==0) System.out.println("First");
			else System.out.println("Second");
		} else {
			if (N%2==0) System.out.println("Second");
			else System.out.println("First");
		}
		sc.close();
	}
}
