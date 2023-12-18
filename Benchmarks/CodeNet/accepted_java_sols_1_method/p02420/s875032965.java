import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String line1 = sc.nextLine();
			if (line1.equals("-")) {
				break;
			}
			sb = new StringBuilder(line1);

			String line2 = sc.nextLine();
			int m = Integer.parseInt(line2);
			for (int i = 0; i < m; i++) {
				String line3 = sc.nextLine();
				int h = Integer.parseInt(line3);
				sb.append(sb.substring(0, h));
				sb.delete(0, h);
			}
			System.out.println(sb);
		}

	}

}