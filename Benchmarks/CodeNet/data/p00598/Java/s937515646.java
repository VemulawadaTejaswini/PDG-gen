

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;
	TreeSet<Integer>[] sets;
	String exp;
	TreeSet<Integer> U;

	@SuppressWarnings("unchecked")
	void run() {
		for (; sc.hasNext();) {
			sets = new TreeSet[256];
			for (char c = 'A'; c <= 'E'; c++) {
				sets[c] = new TreeSet<Integer>();
			}
			U = new TreeSet<Integer>();
			for (;;) {
				char c = sc.next().charAt(0);
				int n = sc.nextInt();
				if (c == 'R' && n == 0) {
					break;
				}
				for (int i = 0; i < n; i++) {
					int e = sc.nextInt();
					sets[c].add(e);
					U.add(e);
				}
			}
			exp = sc.next();
			solve();
		}
	}

	void solve() {
		exp += '\0';
		Result r = e(0);
		debug(r.set.toArray());
		if(r.set.size()==0){
			println("NULL");
		}else{
		for (Iterator<Integer> it = r.set.iterator(); it.hasNext();) {
			print(it.next() + (it.hasNext() ? " " : "\n"));
		}
		}
	}

	Result e(int p) {
		debug("e", p);
		Result r = f(p);
		debug(r.set.toArray(), r.p);
		for (;;) {
			if (op(exp.charAt(r.p))) {
				Result r2 = f(r.p + 1);
				// debug(r2.set.toArray(),r2.p);
				switch (exp.charAt(r.p)) {
				case 'u': // or
					r.set.addAll(r2.set);
					break;
				case 'i': // and
					for (int e : U) {
						if (r.set.contains(e) && r2.set.contains(e)) {
						} else {
							r.set.remove(e);
						}
					}
					break;
				case 'd': // diff
					r.set.removeAll(r2.set);
					break;
				case 's': // sym
					for (int e : U) {
						if (r.set.contains(e) && r2.set.contains(e)) {
							r.set.remove(e);
						} else if (r2.set.contains(e)) {
							r.set.add(e);
						}
					}
					break;
				}
				r.p = r2.p;
			} else {
				break;
			}
		}
		return r;
	}

	void test(){
		TreeSet<Integer> a=new TreeSet<Integer>();
		TreeSet<Integer> b=new TreeSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);

		b.add(1);
		b.add(3);
		b.add(5);
		b.add(7);
		b.add(9);
		b.add(11);
		
		TreeSet<Integer> u=new TreeSet<Integer>();
		u.addAll(a);
		u.addAll(b);
		
		TreeSet<Integer> s=new TreeSet<Integer>();
		TreeSet<Integer> t=new TreeSet<Integer>();

		s.addAll(a);
		t.addAll(b);

		s.addAll(t);
		debug("or",s.toArray());

		s.clear();
		s.addAll(a);
		
		for (int e : u) {
			if (s.contains(e) && t.contains(e)) {
			} else {
				s.remove(e);
			}
		}

		debug("and",s.toArray());
		
		s.clear();
		s.addAll(a);
		
		s.removeAll(t);
		debug("diff",s.toArray());
		
		s.clear();
		s.addAll(a);
		
		for (int e : u) {
			if (s.contains(e) && t.contains(e)) {
				s.remove(e);
			} else if (t.contains(e)) {
				s.add(e);
			}
		}
		debug("sym",s.toArray());
		
	}
	
	boolean op(char c) {
		return c == 'u' || c == 'i' || c == 'd' || c == 's';
	}

	Result f(int p) {
		debug("f", p);
		if (exp.charAt(p) == 'c') {
			Result r = f(p + 1);
			TreeSet<Integer> c = new TreeSet<Integer>();
			for (int e : U) {
				if (!r.set.contains(e)) {
					c.add(e);
				}
			}
			r.set.clear();
			r.set.addAll(c);
			return r;
		} else {
			return t(p);
		}
	}

	Result t(int p) {
		debug("t", p);
		if (exp.charAt(p) == '(') {
			Result r = e(p + 1);
			r.p++; // skip ')'
			return r;
		} else {
			Result r = new Result(p + 1);
			r.set.addAll(sets[exp.charAt(p)]);
			return r;
		}
	}

	class Result {
		int p;
		TreeSet<Integer> set;

		Result(int p) {
			this.p = p;
			set = new TreeSet<Integer>();
		}
	}

	void debug(Object... os) {
		//System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}