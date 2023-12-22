import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c = in.next().toCharArray();
		int[] occur = new int[26];
		
		boolean isAllDiff = true;
		for (int i = 0; i < c.length && isAllDiff; i++) {
			if (occur[c[i] - 'a'] > 0) {
				isAllDiff = false;
			} else {
				occur[c[i] - 'a']++;
			}
		}
		
		System.out.println(isAllDiff ? "yes" : "no");
	}
}