import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String string = sc.nextLine();
			if (string.equals("")) {
				break;

			}
			String[] a = string.split(" ");
			int p = Integer.parseInt(a[0]);
			int q = Integer.parseInt(a[1]);

			int sum = p + q;

			System.out.println(String.valueOf(sum).length());
		}

	}

}