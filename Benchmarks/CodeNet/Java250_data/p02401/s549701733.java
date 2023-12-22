import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();

		String string = "";
		int cn = 0;
		while (true) {
			string = sc.nextLine();
			lines.add(string);
			cn++;
			if (string.contains("?")) {
				break;
			}
		}

		int[] in = new int[2];

		for (int i = 0; i < cn - 1; i++) {
			String[] st = lines.get(i).split(" ");
			in[0] = Integer.parseInt(st[0]);
			in[1] = Integer.parseInt(st[2]);

			if (st[1].equals("+")) {
				System.out.println(in[0] + in[1]);
			} else if (st[1].equals("-")) {
				System.out.println(in[0] - in[1]);
			} else if (st[1].equals("*")) {
				System.out.println(in[0] * in[1]);
			} else if (st[1].equals("/")) {
				System.out.println(in[0] / in[1]);
			}

		}

	}
}