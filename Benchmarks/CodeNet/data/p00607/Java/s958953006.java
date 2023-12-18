import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		ArrayList<String> lines = new ArrayList<String>();
		while (true) {
			String line = sc.nextLine();
			if (line.equals("END_OF_TEXT")) break;
			lines.add(line);
		}
		String buffer = "";
		int r = 0;
		int c = 0;
		while (true) {
			char q = sc.next().charAt(0);
			if (q == '-') break;
			switch (q) {
			case 'a':
				c = 0;
				break;
			case 'e':
				c = lines.get(r).length();
				break;
			case 'p':
				c = 0;
				if (r > 0) --r;
				break;
			case 'n':
				c = 0;
				if (r < lines.size() - 1) ++r;
				break;
			case 'f':
				if (c < lines.get(r).length()) {
					++c;
				} else if (c == lines.get(r).length() && r < lines.size() - 1) {
					c = 0;
					++r;
				}
				break;
			case 'b':
				if (c > 0) {
					--c;
				} else if (c == 0 && r > 0) {
					c = lines.get(r - 1).length();
					--r;
				}
				break;
			case 'd':
				if (c < lines.get(r).length()) {
					lines.set(r, lines.get(r).substring(0, c) + lines.get(r).substring(c + 1));
				} else if (c == lines.get(r).length() && r < lines.size() - 1) {
					lines.set(r, lines.get(r) + lines.get(r + 1));
					lines.remove(r + 1);
				}
				break;
			case 'k':
				if (c < lines.get(r).length()) {
					buffer = lines.get(r).substring(c);
					lines.set(r, lines.get(r).substring(0, c));
				} else if (c == lines.get(r).length() && r < lines.size() - 1) {
					buffer = "\n";
					lines.set(r, lines.get(r) + lines.get(r + 1));
					lines.remove(r + 1);
				}
				break;
			case 'y':
				if (buffer.equals("\n")) {
					lines.add(r + 1, lines.get(r).substring(c));
					lines.set(r, lines.get(r).substring(0, c));
					c = 0;
					++r;
				} else if (buffer.length() > 0) {
					lines.set(r, lines.get(r).substring(0, c) + buffer + lines.get(r).substring(c));
					c += buffer.length();
				}
				break;
			}
		}
		for (String l : lines) {
			System.out.println(l);
		}
	}
}