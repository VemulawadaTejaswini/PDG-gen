
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			String key = sc.next(); int val = sc.nextInt();
			if(map.containsKey(key)) map.put(key, map.get(key)+val);
			else map.put(key, val);
		}
		V[] vs = new V[map.size()]; int i=0;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			vs[i++] = new V(entry.getKey(), entry.getValue());
		}
		sort(vs);
		for(int j=0;j<vs.length;j++) {
			System.out.println(vs[j].s + " " + vs[j].t);
		}
	}
	
	class V implements Comparable<V> {
		String s;
		int t;
		
		V(String s, int t) {
			this.s = s;
			this.t = t;
		}
		
		@Override
		public int compareTo(V o) {
			// TODO Auto-generated method stub
			if(s.length() == o.s.length()) return s.compareTo(o.s);
			return s.length() - o.s.length();
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}