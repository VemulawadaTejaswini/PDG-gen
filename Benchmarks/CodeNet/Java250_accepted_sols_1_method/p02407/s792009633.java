import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();

		String line2 = sc.nextLine();
		String[] a = line2.split(" ");

		int n = Integer.parseInt(line1);

		for (int i = n - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(a[i]);

			} else {
				System.out.print(a[i] + " ");

			}

		}
		System.out.println();
	}

}