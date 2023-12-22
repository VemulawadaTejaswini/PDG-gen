import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		char al = a.charAt(a.length() - 1);
		char bf = b.charAt(0);
		char bl = b.charAt(b.length() - 1);
		char cf = c.charAt(0);
		if (al == bf && bl == cf) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}