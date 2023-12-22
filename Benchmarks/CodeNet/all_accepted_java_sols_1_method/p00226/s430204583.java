import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		char[] r = new char[4];
		char[] a = new char[4];
		while (in.hasNext()) {
			r = in.next().toCharArray();
			a = in.next().toCharArray();
			if (r.length == 1) {
				break;
			}
			int hit = 0, brow = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (r[i] == a[j]) {
						if (i == j) {
							hit++;
						} else {
							brow++;
						}
						break;
					}
				}
			}
			System.out.println(hit + " " + brow);
		}

	}
}