import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		char c0 = N.charAt(0);
		char c1 = N.charAt(1);
		char c2 = N.charAt(2);
		char c3 = N.charAt(3);
		if((c0 == c1 && c1 == c2) || (c1 == c2 && c2 == c3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}