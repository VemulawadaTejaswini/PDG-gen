import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String u = sc.next();

		if (u.equals(s)) {
			System.out.println(a - 1 + " " + b);
		} else {
			int b1 = b - 1;
			System.out.println(a + " " + b1);
		}
	}
}