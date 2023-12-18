import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		n = 16;
		m = 17;
		char[] s = new char[n];
		for (int i = 0; i < n; i++) {
			s[i] = (char)('0' + sc.nextInt());
		}
		
		ans = "123456789:;<=>?0";

		hm = new HashMap<String, Integer>();
		
		Queue<String> q = new ArrayDeque<String>();
		q.add(ans);
		hm.put(ans, 0);

		while (!q.isEmpty()) {
			String u = q.remove();
//			if (u.equals(ans)) {
//				System.out.println(hm.get(u));
//				System.exit(0);
//			}

			if (hm.get(u) > m) {
				continue;
			}
			
			StringBuffer str = new StringBuffer(u);
			int zero = str.indexOf("0");
			assert (zero != -1);
			for (int i = 0; i < d.length; i++) {
				if (zero + d[i] >= 0 && zero + d[i] < n && !(d[i] == -1 && (zero + d[i]) % 4 == 3) && !(d[i] == 1 && (zero + d[i]) % 4 == 0)) {
					str.setCharAt(zero, str.charAt(zero + d[i]));
					str.setCharAt(zero + d[i], '0');
					if (!hm.containsKey(str.toString())) {
						q.add(str.toString());
						hm.put(str.toString(), hm.get(u) + 1);
					}
					str.setCharAt(zero + d[i], str.charAt(zero));
					str.setCharAt(zero, '0');
				}
			}
		}

		hm2 = new HashMap<String, Integer>();
	
		dfs(toString(s), 0);
		
        sc.close();
	}

	private static void dfs(String u, int k) {
		if (hm.containsKey(u)) {
			System.out.println(k + hm.get(u));
			System.exit(0);
		}
		
		if (hm2.containsKey(u) && hm2.get(u) <= k) {
			return;
		}
		if (k > 45 - m) {
			return;
		}

		hm2.put(u, k);
		System.out.println(u + k);

		StringBuffer str = new StringBuffer(u);
		
		int zero = str.indexOf("0");
		assert (zero != -1);
		for (int i = 0; i < d.length; i++) {
			if (zero + d[i] >= 0 && zero + d[i] < n && !(d[i] == -1 && (zero + d[i]) % 4 == 3) && !(d[i] == 1 && (zero + d[i]) % 4 == 0)) {
				str.setCharAt(zero, str.charAt(zero + d[i]));
				str.setCharAt(zero + d[i], '0');
				dfs(str.toString(), k + 1);
				str.setCharAt(zero + d[i], str.charAt(zero));
				str.setCharAt(zero, '0');
			}
		}
	}

	static int n;
	static int m;
	static String ans;
	static final int[] d = {4, -4, -1, 1};
	
	static HashMap<String, Integer> hm;
	static HashMap<String, Integer> hm2;

	private static String toString(char[] s) {
		String ret = "";
		for (int i = 0; i < s.length; i++) {
			ret += s[i];
		}
		
		return ret;
	}
}