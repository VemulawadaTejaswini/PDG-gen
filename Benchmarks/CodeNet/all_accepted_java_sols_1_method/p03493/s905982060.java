import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int count = 0;
		String x;

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		for (int i1 = 0, i2 = 1; i2 <= str.length(); i1++, i2++) {

			x = str.substring(i1, i2);

			if (x.equals("1")) {

				count++;

			}

		}

		System.out.println(count);

		sc.close();

	}
}