import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		boolean can = true;
		if ((s.indexOf("N") == -1 && s.indexOf("S") != -1)) {
			can = false;
		} else if (s.indexOf("N") != -1 && s.indexOf("S") == -1) {
			can = false;
		} else if (s.indexOf("W") == -1 && s.indexOf("E") != -1) {
			can = false;
		} else if (s.indexOf("W") != -1 && s.indexOf("E") == -1) {
			can = false;
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
