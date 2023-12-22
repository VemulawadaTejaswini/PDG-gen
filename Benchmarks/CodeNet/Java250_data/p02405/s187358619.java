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
				if (w == 0) {
					break;
				}
				str01.append(".");
				w--;
			}
			
			w = v;
			
			while (w > 0) {
				str02.append(".");
				w--;
				if (w == 0) {
					break;
				}
				str02.append("#");
				w--;
			}
			
			while (h>0) {
				System.out.println(str01);
				h--;
				if (h==0) {
					break;
				}
				System.out.println(str02);
				h--;
			}
			System.out.println("");
		}
	}
}