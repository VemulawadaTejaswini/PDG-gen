import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.parseInt(line);

		StringBuilder nabeatsu = new StringBuilder(" ");

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				nabeatsu.append(i);
				nabeatsu.append(" ");
			}
		}

		String s = nabeatsu.toString();
		System.out.println(s.substring(0, s.length() - 1));
	}

}