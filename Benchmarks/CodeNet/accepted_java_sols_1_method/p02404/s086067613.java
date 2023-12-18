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
			v = w;

			StringBuilder str01 = new StringBuilder();
			StringBuilder str02 = new StringBuilder();

			while (w > 0) {
				str01.append("#");
				w--;
			}

			w = v;

			str02.append("#");
			while (w - 2 > 0) {
				str02.append(".");
				w--;
			}
			str02.append("#");

			System.out.println(str01);
			while (h - 2 > 0) {
				System.out.println(str02);
				h--;
			}
			System.out.println(str01);
			System.out.println("");
		}
	}
}