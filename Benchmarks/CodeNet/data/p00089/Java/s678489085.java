import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0089/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		final int inf = 1 << 29;
		int[] cur = new int [128];
		fill(cur, -inf);
		cur[0] = 0;
		int prev_n = 0;
		while(sc.hasNext()){
			String[] vars = sc.next().split(",");
			int n = vars.length;
			int[] next = new int[128];
			fill(next, -inf);
			for(int i = 0; i < vars.length; i++) {
				int v = Integer.valueOf(vars[i]);
				next[i] = max(next[i], cur[i] + v);
				if( n > prev_n && i - 1 >= 0 ) next[i] = max(next[i], cur[i - 1] + v);
				if( n < prev_n && i + 1 < prev_n) next[i] = max(next[i], cur[i + 1] + v);
			}
			cur = copyOf(next, next.length);
			prev_n = n;
		}
		int ans = -inf;
		for(int x : cur)
			ans = max(ans, x);
		System.out.println(ans);
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}