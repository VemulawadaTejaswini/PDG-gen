import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			String s = line.substring(i, i + 1);
			char cs = line.charAt(i);
			if (Character.isUpperCase(cs)) {
				answer.append(s.toLowerCase());
			} else {
				answer.append(s.toUpperCase());
			}

		}

		System.out.println(answer);

	}
}