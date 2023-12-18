import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0043
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.next();
			int[] hist = new int[10];
			fill(hist, 0);
			for (int i = 0; i < s.length(); i++) hist[(s.charAt(i) - '0')]++;
			
			boolean[] ok = new boolean[10];
			int iter = 0;
			int[] res = new int[9];
			fill(ok, false);
			
			for (int i = 1; i <= 9; i++) {
				if (hist[i] >= 4) continue;
				hist[i]++;
				for (int j = 1; j <= 9; j++) {
					if (hist[j] >= 2) {
						hist[j] -= 2;
						if (dfs(hist, 0)) {
							ok[i] |= true;
						}
						hist[j] += 2;
					}
				}
				hist[i]--;
				if (ok[i])
					res[iter++] = i;
			}
			
			if (iter == 0) {
				System.out.println(0);
			} else {
				for (int i = 0; i < iter - 1; i++) {
					System.out.print(res[i] + " ");
				}
				System.out.println(res[iter - 1]);
			}
		}
	}	
	
	public static boolean dfs(int[] hist, int cnt) {
		if (cnt >= 4) return true;
		
		boolean ret = false;
		for (int i = 1; i <= 9; i++) {
			if (hist[i] >= 3) {
				hist[i] -= 3;
				ret |= dfs(hist, cnt + 1);
				hist[i] += 3;
			}
			
			if (i <= 7 && hist[i] > 0 && hist[i + 1] > 0 && hist[i + 2] > 0) {
				hist[i] -= 1; hist[i + 1] -= 1; hist[i + 2] -= 1;
				ret |= dfs(hist, cnt + 1);
				hist[i] += 1; hist[i + 1] += 1; hist[i + 2] += 1;
			}
		}
		return ret;
	}
}