import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	String turnR(int p, String d) {
		char[] c = d.toCharArray();
		int p2 = c[c.length - 1] - '0';
		if ('3' <= c[p * 2 + 1] && c[p * 2 + 1] <= '5') {
			c[p2 * 2] = ('3' <= c[p * 2] && c[p * 2] <= '5') ? (char) (c[p * 2] - 3)
					: (char) (c[p * 2] + 3);
		} else {
			c[p2 * 2] = c[p * 2];
		}
		c[p2 * 2 + 1] = c[p * 2 + 1];
		c[p * 2] = c[p * 2 + 1] = '6';
		c[c.length - 1] = (char) (p + '0');
		return new String(c);
	}

	String turnF(int p, String d) {
		char[] c = d.toCharArray();
		int p2 = c[c.length - 1] - '0';
		c[p2 * 2] = c[p * 2 + 1];
		c[p2 * 2 + 1] = c[p * 2];
		c[p * 2] = c[p * 2 + 1] = '6';
		c[c.length - 1] = (char) (p + '0');
		return new String(c);
	}

	String surface(String s) {
		char c[] = new char[9];
		for (int i = 0; i < 9; i++) {
			c[i] = s.charAt(i * 2);
		}
		return new String(c);
	}

	HashMap<String,Boolean> hm;
	boolean equals(String d, int start) {
		if(hm.containsKey(d)){
//			return hm.get(d);
		}
		if(d.charAt(d.length()-1) != start+'0'){
			return false;
		}
		for (int i = 0; i < 9; i++) {
			int c1 = d.charAt(i*2);
			int c2 = d.charAt(i*2 + 1);
			if (start == i)
				continue;
			if(!(c1 == '0' || c2 == '1' || (c1 == '5' && c2=='5'))){
//				hm.put(d, false);
				return false;
			}
//			if (c != '0' && c != '4' && c != '5')
//				return false;
		}
//		hm.put(d, true);
		return true;
	}

	int map[];
	int diff(int a,int b){
		if(map[a]!=0){
			return -map[a]-1;
		}
		int z1 = a/3;
		int z2 = b/3;
		int z3 = a%3;
		int z4 = b%3;
		
		map[a] = -Math.abs(z1-z2)+Math.abs(z1-z2)-1;
		return Math.abs(z1-z2)+Math.abs(z3-z4);
	}
	void run() {
		for (;;) {
			map = new int[9];
			hm = new HashMap<String,Boolean>();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x + y == 0) {
				break;
			}
			x--;
			y--;
			String d = "";
			int ex = -1, ey = -1;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					char in = sc.next().charAt(0);
					if (in == 'W') {
						d += '0';
						d += '3';
					} else if (in == 'R') {
						d += '1';
						d += '4';
					} else if (in == 'B') {
						d += '2';
						d += '5';
					} else {
						ex = j;
						ey = i;
						d += '6';
						d += '6';
					}
				}
			}
			d += (char) ((ex + ey * 3) + '0');

			HashSet<String> used = new HashSet<String>();
			LinkedList<String> q = new LinkedList<String>();
			q.add(d);
			used.add((d));
			boolean ok = false;
			for (int i = 0; i <= 30; i++) {
//				System.out.println(i);
				int size = q.size();
				for (int j = 0; j < size; j++) {
					String cur = q.poll();
					
					if (equals(cur, x + y * 3)) {
						ok = true;
						break;
					}
					
					if(i == 30){
						continue;
					}
					if( i+diff( cur.charAt(cur.length()-1)-'0' , x+y*3)  >= 30) {
						continue;
					}
					int dx[] = { 0, 0, 1, -1 };
					int dy[] = { 1, -1, 0, 0 };
					int pos = cur.charAt(cur.length() - 1) - '0';
					int cx = pos % 3;
					int cy = pos / 3;
					for (int k = 0; k < 4; k++) {
						int nx = dx[k] + cx;
						int ny = dy[k] + cy;
						if (0 <= nx && nx < 3 && ny >= 0 && ny < 3) {
							String next;
							if (nx != cx) {
								// System.out.println(cur);
								next = turnR(nx + ny * 3, cur);
								// System.out.println(next);
							} else {
								// System.out.println(cur);
								next = turnF(nx + ny * 3, cur);
								// System.out.println(next);
							}
							if (!used.contains((next))) {
								used.add((next));
								q.add(next);
							}
						}
					}
				}
				if (ok) {
					System.out.println(i);
					break;
				}
			}
			if (!ok) {
				System.out.println(-1);
			}
		}
	}

	public static void main(String args[]) {
		Main m = new Main();
		m.run();
	}
}