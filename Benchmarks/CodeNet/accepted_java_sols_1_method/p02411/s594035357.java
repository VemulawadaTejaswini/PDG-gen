import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();
		int in = 0;

		while (true) {
			String string = sc.nextLine();

			if (string.equals("-1 -1 -1")) {
				break;
			}
			lines.add(string);
			in++;
		}

		int[] gr = new int[3];

		for (int i = 0; i < in; i++) {
			String[] kari = lines.get(i).split(" ");

			for (int j = 0; j < 3; j++) {
				gr[j] = Integer.parseInt(kari[j]);
			}

			if (gr[0] == -1 || gr[1] == -1) {
				System.out.println("F");
			} else if (gr[0] + gr[1] >= 80) {
				System.out.println("A");
			} else if (gr[0] + gr[1] >= 65) {
				System.out.println("B");
			} else if (gr[0] + gr[1] >= 50
					|| (gr[0] + gr[1] >= 30 && gr[2] >= 50)) {
				System.out.println("C");
			} else if (gr[0] + gr[1] >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}

}