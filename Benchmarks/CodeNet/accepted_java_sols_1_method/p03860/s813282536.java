import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String S3 = sc.next();
		sc.close();
		System.out.printf("%c%c%c\n", S1.charAt(0), S2.charAt(0), S3.charAt(0));
	}
}