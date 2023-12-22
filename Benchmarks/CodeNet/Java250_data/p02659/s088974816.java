import java.util.Scanner;

public class Main {
	public void main(Scanner sc) {
		long a = sc.nextLong();
		long b = new Long(sc.next().replace(".", ""));

		String ans = new Long(a * b).toString();

		if (ans.length() >= 3) {
			System.out.println(ans.substring(0, ans.length() - 2));
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new Main().main(sc);
	}
}
