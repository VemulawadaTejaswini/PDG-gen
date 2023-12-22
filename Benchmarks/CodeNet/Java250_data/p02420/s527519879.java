import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String str = s.next();
			if (str.equals("-")) return;
			int n = Integer.parseInt(s.next());
			for (int i = 0; i < n; ++i) {
				int h = Integer.parseInt(s.next());
				str = str.substring(h, str.length()) + str.substring(0, h);
			}
			System.out.println(str);
		}
	}
}