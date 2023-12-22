import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String line2 = sc.nextLine();
		int totall = Integer.parseInt(line);
		String[] num = line2.split(" ");

		StringBuilder gyaku = new StringBuilder();

		for (int i = totall-1; i >= 0; i--) {
			gyaku.append(num[i]);
			if (i != 0) {
				gyaku.append(" ");

			}
		}

		String reverse = gyaku.toString();
		System.out.println(reverse);

	}

}

