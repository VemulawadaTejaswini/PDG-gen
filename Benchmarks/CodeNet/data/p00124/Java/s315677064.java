import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] param = new String[10];
		do {
			for (int i = 0; i < n; i++) {
				String name = in.next();
				int point = in.nextInt() * 3;
				in.next();
				point += in.nextInt();
				param[i] = String.format("%1$02d%2$02d%3$s,%4$d", point, i,
						name, point);
			}
			Arrays.sort(param, 0, n);
			for (int i = 0; i < n; i++) {
				System.out.println(param[i].substring(4));
			}
			if ((n = in.nextInt()) != 0) {
				System.out.println();
			} else {
				break;
			}
		} while (true);
	}
}