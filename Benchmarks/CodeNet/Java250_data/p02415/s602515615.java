import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		StringBuilder r = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {

			if (Character.isUpperCase(line.charAt(i))) {
				r.append(String.valueOf(line.substring(i, i + 1).toLowerCase()));
			} else if (Character.isLowerCase(line.charAt(i))) {
				r.append(String.valueOf(line.substring(i, i + 1).toUpperCase()));
			} else {
				r.append(String.valueOf(line.substring(i, i + 1)));
			}

		}
		System.out.println(r);
	}
}