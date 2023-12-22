import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		while (!in.hasNext("-")) {
			String n = in.next();
			int cnt = Integer.parseInt(in.next());
			int i, h;
			for (i = 0; i < cnt; i++) {
				h = Integer.parseInt(in.next());
				n = n.substring(h, n.length()) + n.substring(0, h);
			}
			ret.add(n);
		}

		for (String text : ret) {
			System.out.println(text);
		}
	}
}