import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		char c3 = s3.charAt(0);
		c1 = (char)(c1 - 'a' + 'A');
		c2 = (char)(c2 - 'a' + 'A');
		c3 = (char)(c3 - 'a' + 'A');
		System.out.println(c1 + "" + c2 + "" + c3);
	}
}