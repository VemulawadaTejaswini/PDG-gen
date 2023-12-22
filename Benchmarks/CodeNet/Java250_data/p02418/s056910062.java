import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String line2 = sc.nextLine();

		int count = 0;

		for (int i = 0; i < line.length(); i++) {
			StringBuilder r = new StringBuilder();
			r.append(line.substring(line.length() - 1, line.length()));
			r.append(line.substring(0, line.length() - 1));
			line = r.toString();
			if (line.contains(line2)) {
				System.out.println("Yes");
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("No");
		}

	}
}