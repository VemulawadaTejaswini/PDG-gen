
import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		boolean[] isnp = new boolean[10000000];
		for (int i = 2; i * i <= isnp.length; i++)
			if (!isnp[i])
				for (int j = i * i; j < isnp.length; j += i)
					isnp[j] = true;
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 13; i < isnp.length; i++) {
			if (!isnp[i] && !isnp[i-2] && !isnp[i-6] && !isnp[i-8] ) {
				ans.add(i);
			}
		}
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			int idx = Collections.binarySearch(ans, n);
			if (idx >= 0) System.out.println(ans.get(idx));
			else System.out.println(ans.get(-idx-2));
		}
	}
}