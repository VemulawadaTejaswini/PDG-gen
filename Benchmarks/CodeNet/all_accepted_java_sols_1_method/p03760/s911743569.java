import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		String s = "";

		for (int i = 0; i < o.length() + e.length(); i++) {
			if (i % 2 == 0) {
				s += o.charAt(i / 2);
			} else {
				s += e.charAt(i / 2);
			}
		}

		System.out.println(s);

		sc.close();
	}

}
