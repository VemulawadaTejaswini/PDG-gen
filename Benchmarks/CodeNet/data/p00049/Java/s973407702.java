package aoj0049;
import static java.util.Arrays.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> toi = new HashMap<String, Integer>();
		toi.put("A", 0);
		toi.put("B", 1);
		toi.put("AB", 2);
		toi.put("O", 3);

		int[] ans = new int[4];
		for (;sc.hasNext();) {
			String[] s = sc.next().split(",");
			++ans[toi.get(s[1])];
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}