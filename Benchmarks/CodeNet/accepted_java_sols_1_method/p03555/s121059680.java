import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		char c1 = s1.charAt(0);
		char c2 = s1.charAt(1);
		char c3 = s1.charAt(2);
		char d1 = s2.charAt(0);
		char d2 = s2.charAt(1);
		char d3 = s2.charAt(2);
		if (c1 == d3 && c2 == d2 && c3 == d1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
