import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			int m = in.nextInt();
			String s = in.next();
			int count = 0;
			while (s.startsWith("O")) {
				s = s.substring(1);
			}
			while (s.endsWith("0")) {
				s = s.substring(0, s.length() - 1);
			}
			while (s.contains("II")) {
				s = s.replaceAll("I{2,}", "I,I");
			}
			while (s.contains("OO")) {
				s = s.replaceAll("O{2,}", ",");
			}
			String[] split = s.split(",");
			for (String p : split) {
				int l = p.length() - (n * 2 + 1);
				if (l >= 0)
					count += (l / 2 + 1);
			}

			System.out.println(count);
		}
	}
}