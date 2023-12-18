import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();
		int in = 0;

		while (true) {
			String string = new String();
			string = sc.nextLine();

			if (string.equals("0 0")) {
				break;
			}

			lines.add(string);
			in++;
		}

		for (int i = 0; i < in; i++) {
			int h = 0;
			int w = 0;
			int v = 0;
			String[] str = lines.get(i).split(" ");
			h = Integer.parseInt(str[0]);
			w = Integer.parseInt(str[1]);

			while (h > 0) {
				v = w;
				while (w > 0) {
					System.out.print("#");
					w--;
				}
				System.out.println("");
				h--;
				w = v;
			}
			System.out.println("");
		}
	}

}