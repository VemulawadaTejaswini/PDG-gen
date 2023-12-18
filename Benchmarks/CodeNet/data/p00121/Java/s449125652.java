import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	String ans = "01234567";
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			String board = "";
			for (int i = 0; i < 8; i++)
				board += scan.next();
			
			Queue<String> que = new LinkedList<String>();
			que.add(board);
			map.put(board, 0);
			while (!que.isEmpty()) {
				String b = que.poll();
				int index = b.indexOf("0");
				if (b.equals(ans)) {
					System.out.println(map.get(b));
					break;
				}
				if (index != 0 && index != 4) {
					char[] panel = b.toCharArray();
					char tmp = panel[index];
					panel[index] = panel[index - 1];
					panel[index - 1] = tmp;
					String p = String.valueOf(panel);
					if (map.get(p) == null) {
						map.put(p, map.get(b) + 1);
						que.add(p);
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
						que.add(p);
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
						que.add(p);
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
						que.add(p);
					}
				}
			}
		}
	}
	public static void main (String[] args) {
		new Main().run();
	}
}