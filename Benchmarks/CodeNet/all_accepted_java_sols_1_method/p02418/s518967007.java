import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		String output = "No";

		try {
			sc = new Scanner(System.in);

			String str = sc.nextLine();
			String ring = str + str;

			String check = sc.nextLine();

			if (ring.indexOf(check) != -1) {
				output = "Yes";
			}
			System.out.println(output);
		} finally {
			sc.close();
		}
	}

}