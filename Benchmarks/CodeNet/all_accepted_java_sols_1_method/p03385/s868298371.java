import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String abc = sc.next();

		if (abc.equals("abc") || abc.equals("acb") || abc.equals("bac") || abc.equals("bca") || abc.equals("cab") || abc.equals("cba")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}