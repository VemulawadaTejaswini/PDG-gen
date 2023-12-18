import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String order = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt() + 1;

			if (order.equals("print")) {
				System.out.println( str.substring(a, b) );
			} else if (order.equals("reverse")) {
				str.replace(a, b, new StringBuilder(str.substring(a, b)).reverse().toString());
			} else {
				String s = sc.next();
				str.replace(a, b, s);
			}
		}

	}
}
