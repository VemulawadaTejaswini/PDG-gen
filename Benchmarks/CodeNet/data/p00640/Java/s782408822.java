
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			String np = "";
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			Map<String, Page> pages = new HashMap<String, Main.Page>();
			while (n-- > 0) {
				Page p = new Page();
				String name = scanner.next();
				if (np.equals(""))
					np = name;
				int b = scanner.nextInt();
				while (b-- > 0) {
					int sx = scanner.nextInt();
					int sy = scanner.nextInt();
					int ex = scanner.nextInt();
					int ey = scanner.nextInt();
					String to = scanner.next();
					Button bn = new Button(sx, sy, ex, ey, to);
					p.buttons.add(bn);
				}
				pages.put(name, p);
			}
			int m = scanner.nextInt();
			List<String> buff = new ArrayList<String>();
			buff.add(np);
			int pi = 0;
			int br = 1;
			while (m-- > 0) {
				String op = scanner.next();
				if (op.equals("click")) {
					int x = scanner.nextInt();
					int y = scanner.nextInt();
					String to = pages.get(buff.get(pi)).click(x, y);
					if (!to.isEmpty()) {
						pi++;
						if (pi == buff.size())
							buff.add(to);
						else
							buff.set(pi, to);
						br = pi + 1;
					}
				} else if (op.equals("back")) {
					if (pi != 0)
						pi--;
				} else if (op.equals("forward")) {
					if (pi + 1 != br)
						pi++;
				} else
					System.out.println(buff.get(pi));
			}
		}
	}

	class Button {
		int sx, sy, ex, ey;
		String to;

		public Button(int sx, int sy, int ex, int ey, String to) {
			super();
			this.sx = sx;
			this.sy = sy;
			this.ex = ex;
			this.ey = ey;
			this.to = to;
		}

		@Override
		public String toString() {
			return "Button [sx=" + sx + ", sy=" + sy + ", ex=" + ex + ", ey="
					+ ey + ", to=" + to + "]";
		}

		boolean isHit(int x, int y) {
			return sx <= x && x <= ex && sy <= y && y <= ey;
		}
	}

	class Page {
		List<Button> buttons = new ArrayList<Main.Button>();

		String click(int x, int y) {
			for (int i = 0; i < buttons.size(); i++) {
				if (buttons.get(i).isHit(x, y))
					return buttons.get(i).to;
			}
			return "";
		}

		@Override
		public String toString() {
			return "Page [buttons=" + buttons + "]";
		}
	}
}