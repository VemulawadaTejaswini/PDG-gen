import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int r = 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i) != t.charAt(i)) ++r;
		}
		System.out.println(r);
	}
}
