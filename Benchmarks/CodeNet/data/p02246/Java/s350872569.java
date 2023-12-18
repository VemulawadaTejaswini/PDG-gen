import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = 16;
		int limit = 45;
		final int[] d = {4, -4, -1, 1};
		
		char[] s = new char[n];
		for (int i = 0; i < n; i++) {
			s[i] = (char)('0' + sc.nextInt());
		}
		
		String ans = "123456789:;<=>?0";

		hm = new HashMap<String, Integer>();
		hm2 = new HashMap<String, Integer>();
		
		Queue<String> q = new PriorityQueue<String>(11, new PanelComparator());
		q.add(toString(s));
		hm.put(toString(s), 0);
		hm2.put(toString(s), getMin(toString(s)));

		while (!q.isEmpty()) {
			String u = q.remove();
			if (u.equals(ans)) {
				System.out.println(hm.get(u));
				System.exit(0);
			}

			if (hm.get(u) + hm2.get(u) > limit) {
				continue;
			}
			
			StringBuffer str = new StringBuffer(u);
			int zero = str.indexOf("0");
			assert (zero != -1);
			for (int i = 0; i < d.length; i++) {
				if (zero + d[i] >= 0 && zero + d[i] < n && !(d[i] == -1 && (zero + d[i]) % 4 == 3) && !(d[i] == 1 && (zero + d[i]) % 4 == 0)) {
					str.setCharAt(zero, str.charAt(zero + d[i]));
					str.setCharAt(zero + d[i], '0');
					if (!hm.containsKey(str.toString()) || hm.get(str.toString()) > hm.get(u) + 1) {
						hm.put(str.toString(), hm.get(u) + 1);
						hm2.put(str.toString(), getMin(str.toString()));
						q.add(str.toString());
					}
					str.setCharAt(zero + d[i], str.charAt(zero));
					str.setCharAt(zero, '0');
				}
			}
		}
		
        sc.close();
	}

	private static HashMap<String, Integer> hm;
	private static HashMap<String, Integer> hm2;

	private static String toString(char[] s) {
		String ret = "";
		for (int i = 0; i < s.length; i++) {
			ret += s[i];
		}
		
		return ret;
	}
	
	private static int getMin(String s) {
		char[] c = s.toCharArray();
		int ret = 0;
		for (int i = 0; i < c.length; i++) {
			int tmp = c[i] - '0';
			if (tmp != 0) {
				int x = (tmp - 1) % 4;
				int y = (tmp - 1) / 4;
				ret += Math.abs(x - i % 4) + Math.abs(y - i / 4);
			}
		}
		
		return ret;
	}
	
	private static class PanelComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return hm2.get(o1) + hm.get(o1) - hm2.get(o2)- hm.get(o2);
		}
	}
}