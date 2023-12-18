import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		Map<String, List<Button>> map = new HashMap<String, List<Button>>();
		LinkedList<String> pre = new LinkedList<String>();
		LinkedList<String> next = new LinkedList<String>();
		String now = "";
		while ((n = in.nextInt()) != 0) {
			map.clear();
			pre.clear();
			next.clear();
			int w = in.nextInt();
			int h = in.nextInt();
			for (int page_info = 0; page_info < n; page_info++) {
				String pageName = in.next();
				if (page_info == 0) {
					now = pageName;
				}
				int bt_count = in.nextInt();
				List<Button> buttons = new ArrayList<Button>();
				for (int i = 0; i < bt_count; i++) {
					buttons.add(new Button(in.nextInt(), in.nextInt(), in
							.nextInt(), in.nextInt(), in.next()));
				}
				map.put(pageName, buttons);
			}
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				String command = in.next();
				if ("click".equals(command)) {
					int x = in.nextInt();
					int y = in.nextInt();
					for (Button bt : map.get(now)) {
						if (bt.c(x, y)) {
							pre.addLast(now);
							now = bt.target;
							next.clear();
							break;
						}
					}
				} else if ("back".equals(command)) {
					if (!pre.isEmpty()) {
						next.addFirst(now);
						now = pre.pollLast();
					}
				} else if ("forward".equals(command)) {
					if (!next.isEmpty()) {
						pre.addLast(now);
						now = next.pollFirst();
					}
				} else if ("show".equals(command)) {
					assert true;
					System.out.println(now);
				}
			}
		}

	}
}

class Button {
	final int minX, minY, maxX, maxY;
	final String target;

	Button(int minX, int minY, int maxX, int maxY, String target) {
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
		this.target = target;
	}

	boolean c(int x, int y) {
		return (minX <= x && x <= maxX && minY <= y && y <= maxY);
	}
}