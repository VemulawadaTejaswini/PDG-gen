import java.util.Comparator;
import java.util.HashSet;
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

		hs = new HashSet<String>();
		
		Queue<Panel> q = new PriorityQueue<Panel>(11, new PanelComparator());
		hs.add(toString(s));
		q.add(new Panel(toString(s), 0, getMin(toString(s))));

		while (!q.isEmpty()) {
			Panel u = q.remove();
			if (u.s.equals(ans)) {
				System.out.println(u.count);
				System.exit(0);
			}

			if (u.count + u.min > limit) {
				continue;
			}
			
			StringBuffer str = new StringBuffer(u.s);
			int zero = str.indexOf("0");
			assert (zero != -1);
			for (int i = 0; i < d.length; i++) {
				if (zero + d[i] >= 0 && zero + d[i] < n && !(d[i] == -1 && (zero + d[i]) % 4 == 3) && !(d[i] == 1 && (zero + d[i]) % 4 == 0)) {
					str.setCharAt(zero, str.charAt(zero + d[i]));
					str.setCharAt(zero + d[i], '0');
					String tmps = str.toString();
					if (!hs.contains(tmps)) {
						hs.add(tmps);
						q.add(new Panel(tmps, u.count + 1, getMin(tmps)));
					}
					str.setCharAt(zero + d[i], str.charAt(zero));
					str.setCharAt(zero, '0');
				}
			}
		}
		
        sc.close();
	}

	private static HashSet<String> hs;

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
	
	private static class Panel {
		String s;
		int count;
		int min;
		
		Panel (String s, int count, int min) {
			this.s = s;
			this.count = count;
			this.min = min;
		}
	}
	
	private static class PanelComparator implements Comparator<Panel>{
		@Override
		public int compare(Panel o1, Panel o2) {
			return o1.count + o1.min - o2.count - o2.min;
		}
	}
}