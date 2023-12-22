import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		String s = scanner.next();
		String t = scanner.next();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(s.substring(i, i + 1));
			sb.append(t.substring(i, i + 1));
		}

		System.out.println(sb.toString());
	}

}