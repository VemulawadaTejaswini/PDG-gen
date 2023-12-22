import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a.charAt(i) == b.charAt(i)) {
				if (a.charAt(i) == c.charAt(i)) {

				} else {
					count++;
				}
			} else {
				if (a.charAt(i) == c.charAt(i)) {
					count++;
				} else {
					if (b.charAt(i) == c.charAt(i)) {
						count++;
					} else {
						count += 2;
					}
				}
			}
		}
		System.out.print(count);

		scanner.close();
	}

}
