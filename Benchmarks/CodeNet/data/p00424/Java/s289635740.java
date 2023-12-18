import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		Map<Character, Character> map = new HashMap<Character, Character>();
		int n, m;
		String s;
		StringBuilder sb = new StringBuilder();
		char c;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			sc.nextLine();
			map.clear();
			for (int i = 0; i < n; i++) {
				s = sc.nextLine();
				map.put(s.charAt(0), s.charAt(2));
			}
			m = sc.nextInt();
			sc.nextLine();
			sb.setLength(0);
			for (int i = 0; i < m; i++) {
				s = sc.nextLine();
				c = s.charAt(0);
				if (map.containsKey(c)) {
					sb.append(map.get(c));
				} else {
					sb.append(c);
				}
			}
			out.println(sb);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}