import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<String> k = new ArrayList<String>();
		while (true) {
			String line = sc.nextLine();
			k.add(line);
			if (line.equals("-1 -1 -1")) {
				break;
			}
		}
		for (String string : k) {
			if (string.equals("-1 -1 -1")) {
				break;
			}
			String[] sei = string.split(" ");
			int[] v = new int[3];
			for (int i = 0; i < sei.length; i++) {
				v[i] = Integer.parseInt(sei[i]);
			}
			if (v[0] == -1 || v[1] == -1) {
				System.out.println("F");
			} else if (v[0] + v[1] >= 80) {
				System.out.println("A");
			} else if (v[0] + v[1] < 80 && v[0] + v[1] >= 65) {
				System.out.println("B");
			} else if (v[0] + v[1] < 65 && v[0] + v[1] >= 50) {
				System.out.println("C");
			} else if (v[0] + v[1] < 50 && v[0] + v[1] >= 30) {
				if (v[2] >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else if (v[0] + v[1] < 30) {
				System.out.println("F");
			}

		}

	}

}