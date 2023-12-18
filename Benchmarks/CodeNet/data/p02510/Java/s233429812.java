import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			String str = in.next();
			if ("-".equals(str)) {
				break;
			}
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				int h = in.nextInt();
				str = str.substring(h) + str.substring(0, h);
			}
			System.out.println(str);
		}
	}
}