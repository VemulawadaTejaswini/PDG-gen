import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int n = in.nextInt();
		int q = in.nextInt();

		int[] cnt = new int[n+1];

		SegmentTree rmq = new SegmentTree(n+1);

		for (int i=1; i<=n; i++) {
			rmq.set(i, new Pair(0,i));
		}

		while (q-- > 0) {
			int a = in.nextInt();
			int v = in.nextInt();
			rmq.set(a, new Pair(rmq.get(a).first+v, a));
			Pair p = rmq.get(0,n+1);
			out.println(p.second+" "+p.first);
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}


class SegmentTree {

	public final int length;
	public static final int I = Integer.MAX_VALUE/2;
	private final int reviceLen;
	private final int internalLen;
	private Pair[] data;

	public SegmentTree(int n) {
		this.length = n;
		this.reviceLen = Integer.highestOneBit(Math.max(length-1,1))<<1;
		this.internalLen = 2*reviceLen - 1;
		this.data = new Pair[internalLen];
		for (int i=0; i<internalLen; i++) data[i] = new Pair(-I, I);
	}

	public void set(int idx, Pair val) {
		idx += reviceLen-1;
		data[idx] = val;
		while (idx > 0) {
			idx = (idx - 1) >>> 1;
			data[idx] = Pair.eval(data[idx*2+1], data[idx*2+2]);
		}
	}

	public Pair get(int idx) {
		return data[idx + reviceLen - 1];
	}

	public Pair get(int begin, int end) {
		return get(begin, end, 0, 0, reviceLen);
	}

	private Pair get(int begin, int end, int idx, int lb, int ub) {
		if (ub <= begin || end <= lb) return new Pair(-I, I);
		if (begin <= lb && ub <= end) return data[idx];

		Pair vl = get(begin, end, idx*2+1, lb, (lb + ub)/2);
		Pair vr = get(begin, end, idx*2+2, (lb + ub)/2, ub);
		return Pair.eval(vl, vr);
	}

	public String toString() {
		Pair[] val = new Pair[length];
		for (int i=0; i<length; i++) val[i] = data[i + reviceLen - 1];
		return Arrays.toString(val);
	}
}

class Pair implements Comparable {
	int first, second;

	public Pair(int first, int second) {
		this.first = first; this.second = second;
	}

	public boolean equals(Object o) {
		Pair other = (Pair)o;
		return this.first == other.first && this.second == other.second;
	}

	public int compareTo(Object o) {
		Pair other = (Pair)o;
		if (other.first != this.first) return other.first - this.first;
		return this.second - other.second;
	}

	// public static Pair eval(Pair a, Pair b) {
	// 	return a.compareTo(b) < 0 ? a : b;
	// }

	public static Pair eval(Pair a, Pair b) {
		if (b.first != a.first) return a.first > b.first ? a : b;
		return a.second < b.second ? a : b;
	}

	public String toString() {
		return "("+first+","+second+")";
	}
}