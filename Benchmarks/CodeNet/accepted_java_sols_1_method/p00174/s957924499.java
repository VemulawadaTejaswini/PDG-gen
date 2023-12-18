
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.next();
			if (a.charAt(0) == '0')
				break;
			char[][] line = new char[3][];
			line[0] = a.toCharArray();
			line[1] = scanner.next().toCharArray();
			line[2] = scanner.next().toCharArray();
			for (char[] c : line) {
				int ac = 0;
				int bc = 0;
				for (int i = 1; i < c.length; i++) {
					if (c[i] == 'A') {
						ac++;
					} else {
						bc++;
					}
				}
				if (ac > bc) {
					System.out.println(ac + 1 + " " + bc);
				} else {
					System.out.println(ac + " " + (bc + 1));
				}
			}
		}
	}
}