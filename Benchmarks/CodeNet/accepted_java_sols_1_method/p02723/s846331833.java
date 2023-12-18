import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		if (n.charAt(2) == n.charAt(3) && n.charAt(4) == n.charAt(5)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}
}