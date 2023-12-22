import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		long H = Long.parseLong(line.split("\\s+")[0]);

		HashMap<Long, Long> mem = new HashMap<>();

		long res = dfs(H, mem);
		System.out.println(res);

		return;
	}

	public long dfs(long x, Map<Long, Long> mem) {
		if (x == 1) return 1;

		long key = x;
		if (mem.containsKey(key)) return mem.get(key);

		long res = 2 * dfs(x/2, mem) + 1;
		mem.put(key, res);

		return res;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

// f(x) = 2 * f( floor(x/2) ) + 1;
// f(1) = 1;
