
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashSet<Integer> scores = new HashSet<Integer>();
		for(;;) {
			String[] str = sc.next().split(",");
			int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);
			if( (a|b) == 0 ) break;
			map.put(a, b);
			scores.add(b);
		}
		int[] ans = new int[scores.size()];
		int i=0;
		for(int a: scores) ans[i++] = a;
		sort(ans);
		while(sc.hasNext()) {
			int q = sc.nextInt();
			System.out.println( (ans.length - binarySearch(ans, map.get(q))) );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}