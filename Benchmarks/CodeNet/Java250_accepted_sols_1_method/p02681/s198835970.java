import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		StringBuilder b = new StringBuilder(sc.next());
		String r = b.deleteCharAt(b.length()-1).toString();

		if (a.equals(r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
