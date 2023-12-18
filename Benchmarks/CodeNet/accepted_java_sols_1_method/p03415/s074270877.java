import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
		String ss1 = s1.substring(0, 1), ss2 = s2.substring(1, 2), ss3 = s3.substring(2);
		System.out.println(ss1 + ss2 + ss3);
		sc.close();
	}
}
