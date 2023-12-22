import java.util.Scanner;

public class Main {

	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		String u = scan.next();

		if (u.equals(s)) a--;
		if (u.equals(t)) b--;

		System.out.println(a + " " + b);

		scan.close();
	}
}