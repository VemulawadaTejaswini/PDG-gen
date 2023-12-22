import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		char d = str.charAt(3);
		if (a == b && c == d && a != c || a == c && b == d && a != b || a == d && b == c && a != b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}