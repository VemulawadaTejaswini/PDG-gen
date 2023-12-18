import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			String str = in.next();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				sb.setLength(0);
				int counter = 0;
				char c = str.charAt(0);
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) != c) {
						sb.append(counter);
						sb.append(c);
						counter = 0;
						c = str.charAt(i);
					}
					counter++;
				}
				sb.append(counter);
				sb.append(c);
				str = sb.toString().trim();
			}
			System.out.println(str);
		}
	}
}