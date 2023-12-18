import java.awt.Rectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Page[] buffer = new Page[10000];

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Arrays.fill(buffer, null);
			int W = sc.nextInt();
			int H = sc.nextInt();
			Page[] pages = new Page[N];
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < N; ++i) {
				String name = sc.next();
				map.put(name, i);
				int b = sc.nextInt();
				pages[i] = new Page(name, b);
				for (int j = 0; j < b; ++j) {
					int x1 = sc.nextInt();
					int y1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					pages[i].button[j] = new Rectangle(x1, y1, x2 - x1, y2 - y1);
					pages[i].linkTo[j] = sc.next();
				}
			}
			int bp = 0;
			buffer[0] = pages[0];
			int M = sc.nextInt();
			for (int i = 0; i < M; ++i) {
				String q = sc.next();
				if (q.equals("click")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int j = 0; j < pages[bp].button.length; ++j) {
						if (pages[bp].button[j].contains(x, y)) {
							for (int k = bp + 1; buffer[k] != null; ++k) {
								buffer[k] = null;
							}
							buffer[bp + 1] = pages[map.get(pages[bp].linkTo[j])];
							++bp;
							break;
						}
					}
				} else if (q.equals("back")) {
					if (bp > 0) --bp;
				} else if (q.equals("forward")) {
					if (buffer[bp + 1] != null) ++bp;
				} else if (q.equals("show")) {
					System.out.println(buffer[bp].name);
				}
			}
		}
	}

	static class Page {
		Rectangle[] button;
		String[] linkTo;
		String name;

		Page(String name, int buttonCount) {
			this.name = name;
			this.button = new Rectangle[buttonCount];
			this.linkTo = new String[buttonCount];
		}
	}

}