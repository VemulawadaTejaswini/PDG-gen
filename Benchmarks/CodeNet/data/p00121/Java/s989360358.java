
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
		pow = new int[8];
		pow[0] = 1;
		for (int i=1;i<8;i++) pow[i] = pow[i-1]*10;
		for (;sc.hasNext();) {
			int[] map = new int[8];
			for (int i=0;i<8;i++) {
				map[i] = sc.nextInt();
			}
			System.out.println(solve(map));
		}
	}
	
	int solve(int[] map) {
		S s = new S(map, 0);
		PriorityQueue<S> q = new PriorityQueue<S>();
		HashSet<Integer> used = new HashSet<Integer>();
		used.add(s.a);
		q.add(s);
		for (;!q.isEmpty();) {
			S cur = q.remove();
			if (isGoal(cur)) return cur.c;
//			debug(nextState(cur));
			for (int next:nextState(cur)) if (! used.contains(next)){
				q.add(new S(next, cur.c+1));
				used.add(next);
			}
		}
		return -1;
	}
	
	boolean isGoal(S s) {
		if(s.a != 1234567)
			return false;
		return s.a == 1234567;
	}
	int[] pow;
	int[] nextState(S s) {
		int cur = s.a;
		int p=0;
		String num = "" + cur;
		if (num.length() == 7) p = 0;
		else for (;p<8;p++) if (num.charAt(p) == '0') break;
		p = 7-p;
		if (p == 1 || p == 2 || p == 5 || p == 6) {
			int[] next = new int[3];
			next[0] = swap(cur, p, p-1);
			next[1] = swap(cur, p, p+1);
			next[2] = swap(cur, p, (p+4)%8);
			return next;
		}
		if (p == 0 || p == 4) {
			int[] next = new int[2];
			next[0] = swap(cur, p, p+1);
			next[1] = swap(cur, p, (p+4)%8);
			return next;
		}
		int[] next = new int[2];
		next[0] = swap(cur, p, p-1);
		next[1] = swap(cur, p, (p+4)%8);
		return next;
	}
	
	int swap(int a, int s, int t) {
		int tmp1 = (a / pow[s]) % 10;
		int tmp2 = (a / pow[t]) % 10;
		
		return a + (tmp2 - tmp1) * pow[s] + (tmp1 - tmp2) * pow[t];
	}
	
	class S implements Comparable<S>{
		int a;
		int c;
		S (int[] a, int c) {
			this.a = 0;
			for (int i=0;i<8;i++) this.a += a[i] * pow[7-i];
			this.c = c;
		}
		
		S(int a, int c) {
			this.a = a;
			this.c = c;
		}
		@Override
		public int compareTo(S arg0) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return c - arg0.c;
		}
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}