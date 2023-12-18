import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String before = sc.next();
		String after = sc.next();
		if (before.length() + 1 == after.length() && before.equals(after.substring(0, after.length() - 1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
