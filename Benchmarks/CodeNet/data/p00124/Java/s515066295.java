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
				param[i] = String.format("%02d%02d%s,%d", 30-point, i,
						name, point);
			}
			Arrays.sort(param, 0, n);
			for (int i = 0; i < n; i++) {
				System.out.println(param[i].substring(4));
			}
			if ((n = in.nextInt()) == 0) {
				break;
			} else {
				System.out.println();
			}
		} while (true);
	}
}