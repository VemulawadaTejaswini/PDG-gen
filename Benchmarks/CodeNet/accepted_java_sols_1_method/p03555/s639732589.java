import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c1 = sc.nextLine();
		String c2 = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(c2.substring(2)).append(c2.substring(1, 2)).append(c2.substring(0, 1));

		String c2Reverse = sb.toString();

		if (c1.equals(c2Reverse)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}