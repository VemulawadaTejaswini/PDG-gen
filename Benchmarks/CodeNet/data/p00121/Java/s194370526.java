import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	String swap(String s, int x, int y) {
		if (x > y) {
			int t = x;
			x = y; 
			y = t;
		}
		if (x < 0 || y >= 8 || (x == 3 && y == 4)) return null;
		String res = "";
		for (int i = 0; i < 8; i++) {
			if (i == x)
				res += s.charAt(y);
			else if (i == y)
				res += s.charAt(x);
			else
				res += s.charAt(i);
		}
		return res;
	}
	
	String[] change(String s) {
		int n = 0;
		for (int i = 0; i < 8; i++) {
			if (s.charAt(i) == '0') {
				n = i;
				break;
			}
		}
		String[] res = new String[3];
		res[0] = swap(s, n, (1-n/4)*4+n%4);
		res[1] = swap(s, n, n+1);
		res[2] = swap(s, n, n-1);
		return res;
	}
	
	void run() {
		while (sc.hasNext()) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			String s = "";
			for (int i = 0; i < 8; i++)
				s += String.valueOf(sc.nextInt());
			map.put(s, 0);
			Queue<String> queue = new LinkedList<String>();
			queue.add(s);
			while (!queue.isEmpty() && !map.containsKey("01234567")) {
				String st = queue.poll();
				String[] sts = change(st);
				for (int i = 0; i < 3; i++) {
					if (sts[i] != null && !map.containsKey(sts[i])) {
						map.put(sts[i], map.get(st)+1);
						queue.add(sts[i]);
					}
				}
			}
			out.println(map.get("01234567"));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}