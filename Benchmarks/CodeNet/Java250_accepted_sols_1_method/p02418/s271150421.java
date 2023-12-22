import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		int len1 = line1.length();
		int i = 0;

		while (i < len1) {
			if (line1.contains(line2)) {
				System.out.println("Yes");
				break;
			}
			String a = line1.substring(0, 1);
			String b = line1.substring(1);
			line1 = b + a;
			i++;
		}

		if (i == line1.length()) {
			System.out.println("No");
		}
	}

}