import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder();
		char c1 = (char)(s1.charAt(0) - 'a' + 'A');
		char c2 = (char)(s2.charAt(0) - 'a' + 'A');
		char c3 = (char)(s3.charAt(0) - 'a' + 'A');
		sb.append(c1).append(c2).append(c3);
		System.out.println(sb.toString());
	}
}