import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String q_str = sc.nextLine();
		int q = Integer.parseInt(q_str);

		String[] com = new String[q];

		for (int i = 0; i < q; i++) {
			com[i] = sc.nextLine();
		}

		for (int i = 0; i < q; i++) {
			String[] command = com[i].split(" ");

			int a = Integer.parseInt(command[1]);
			int b = Integer.parseInt(command[2]);

			if (command[0].equals("print")) {
				System.out.println(str.substring(a, b + 1));
			} else if (command[0].equals("reverse")) {
				String X = str.substring(0, a);
				String Y = str.substring(b + 1);

				StringBuilder s = new StringBuilder(str.substring(a, b + 1));
				s = s.reverse();

				str = X + s.toString() + Y;
			} else if (command[0].equals("replace")) {
				String X = str.substring(0, a);
				String Y = str.substring(b + 1);

				str = X + command[3] + Y;
			}
		}

	}

}