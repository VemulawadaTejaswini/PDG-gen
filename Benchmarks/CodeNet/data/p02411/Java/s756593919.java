import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true) {
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if (m == -1 && f == -1 && r == -1)
				break;
			System.out.println(run(m, f, r));
		}
		System.exit(0);
	}

	private static String run(int m, int f, int r) {
		if (m == -1 || f == -1)
			return ("F");
		if (m + f >= 80)
			return ("A");
		if (m + f >= 65)
			return ("B");
		if (m + f >= 50)
			return ("C");
		if (m + f >= 30)
			if (r >= 50)
				return ("C");
			else
				return ("D");
		return ("F");

	}
}