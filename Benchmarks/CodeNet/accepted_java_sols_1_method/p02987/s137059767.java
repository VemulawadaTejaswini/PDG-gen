import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int first = 0;
		int count = 1;

		for (int i = 1; i < 4; i++) {

			if (s.substring(0, 1).equals(s.substring(i, i + 1))) {
				count++;

				if (count > 2) {
					System.out.print("No");
					System.exit(0);
				} else {
					first = i;
				}
			}
		}
		if (count == 2) {
			if (first == 1) {
				if (s.substring(2, 3).equals(s.substring(3, 4))) {
					if (!(s.substring(0, 1).equals(s.substring(2, 3)))) {
						System.out.print("Yes");
						System.exit(0);
					}
				} else {
					System.out.print("No");
					System.exit(0);
				}
			}
			if (first == 2) {
				if (s.substring(3, 4).equals(s.substring(1, 2))) {
					if (!(s.substring(0, 1).equals(s.substring(1, 2)))) {
						System.out.print("Yes");
						System.exit(0);
					}
				} else {
					System.out.print("No");
					System.exit(0);
				}

			}
			if (first == 3) {
				if (s.substring(2, 3).equals(s.substring(1, 2))) {
					if (!(s.substring(0, 1).equals(s.substring(2, 3)))) {
						System.out.print("Yes");
						System.exit(0);
					}
				} else {
					System.out.print("No");
					System.exit(0);
				}
			}
		} else {
			System.out.print("No");
			System.exit(0);
		}

	}

}