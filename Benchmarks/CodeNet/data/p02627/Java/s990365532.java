import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = (int)s.charAt(0);

		if ((int)'a' <= c && c <= (int)'z') {
			System.out.println("a");
		} else {
			System.out.println("A");
		}

		sc.close();
	}

}
