import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2 = sc.next();
		sc.close();
		System.out.println(s.charAt(0) == s2.charAt(2) && s.charAt(1) == s2.charAt(1) && s.charAt(2) == s2.charAt(0) ? "YES" : "NO");

	}
}

