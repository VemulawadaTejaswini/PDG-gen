import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String c = sc.next();
			if (c.equals("-")) {
				break;
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				String head = c.substring(0, h);
				String tail = c.substring(h);
				c = tail + head;
			}
			System.out.println(c);
		}
	}
}


