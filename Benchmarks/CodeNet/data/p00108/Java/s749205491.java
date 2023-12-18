
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n= sc.nextInt();
			if(n==0) break;
			int[] s, p;
			s = new int[n];
			p = new int[n];
			for(int i=0;i<n;i++) s[i] = sc.nextInt();
			int cnt = 0;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(;;) {
//				debug(s);
//				debug(p);
				for(int i=0;i<n;i++) {
					if(map.containsKey(s[i])) map.put(s[i], map.get(s[i])+1);
					else map.put(s[i], 1);
				}
				for(int i=0;i<n;i++) p[i] = map.get(s[i]);
				
				boolean flg = true;
				for(int i=0;i<n;i++) {
					if(s[i] != p[i]) {
						flg = false;
						break;
					}
				}
				s = p.clone();
				map.clear();
				if(flg) break;
				cnt++;
			}
			System.out.println(cnt);
			System.out.print(s[0]);
			for(int i=1;i<n;i++) System.out.print(" " + s[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}