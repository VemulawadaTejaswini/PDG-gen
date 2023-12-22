import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
		if (y.length() <= x) {
			System.out.println(y);
		} else {
			System.out.println(y.substring(0, x) + "...");
		}
	}
}