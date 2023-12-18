import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	void run() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Queue<char[]> que = new LinkedList<char[]>();
		que.add("01234567".toCharArray());
		map.put("01234567", 0);
		while (!que.isEmpty()) {
			String b = String.valueOf(que.poll());
			int index = b.indexOf("0");
			if (index != 0 && index != 4) {
				char[] panel = b.toCharArray();
				char tmp = panel[index];
				panel[index] = panel[index - 1];
				panel[index - 1] = tmp;
				String p = String.valueOf(panel);
				if (map.get(p) == null) {
					map.put(p, map.get(b) + 1);
					que.add(p.toCharArray());
				}
			}
			if (index != 3 && index != 7) {
				char[] panel = b.toCharArray();
				char tmp = panel[index];
				panel[index] = panel[index + 1];
				panel[index + 1] = tmp;
				String p = String.valueOf(panel);
				if (map.get(p) == null) {
					map.put(p, map.get(b) + 1);
					que.add(p.toCharArray());
				}
			}
			if (index < 4) {
				char[] panel = b.toCharArray();
				char tmp = panel[index];
				panel[index] = panel[index + 4];
				panel[index + 4] = tmp;
				String p = String.valueOf(panel);
				if (map.get(p) == null) {
					map.put(p, map.get(b) + 1);
					que.add(p.toCharArray());
				}
			}
			if (index > 3) {
				char[] panel = b.toCharArray();
				char tmp = panel[index];
				panel[index] = panel[index - 4];
				panel[index - 4] = tmp;
				String p = String.valueOf(panel);
				if (map.get(p) == null) {
					map.put(p, map.get(b) + 1);
					que.add(p.toCharArray());
				}
			}
		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String board = "";
			for (int i = 0; i < 8; i++)
				board += scan.next();
			System.out.println(map.get(board));
		}
	}
	public static void main (String[] args) {
		new Main().run();
	}
}