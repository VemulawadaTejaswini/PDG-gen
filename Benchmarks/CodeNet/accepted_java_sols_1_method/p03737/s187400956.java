import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();

		String a = String.valueOf(s1.charAt(0));
		String b = String.valueOf(s2.charAt(0));
		String c = String.valueOf(s3.charAt(0));

		String A = a.toUpperCase();
		String B = b.toUpperCase();
		String C = c.toUpperCase();

		System.out.println( A + B + C );
	}
}