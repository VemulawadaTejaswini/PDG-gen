import java.io.*;
import java.util.*;

class P{
	long x, y;
	char u;
	public P(int x, int y, char u) {
		super();
		this.x = x;
		this.y = y;
		this.u = u;
	}
	
}

public class Main {
	static void solve() {
		int n = ni();
		P[] ps = new P[n];
		for(int i=0;i<n;i++) {
			ps[i] = new P(ni(), ni(), nc());
		}
		//line
		Map<Long, TreeSet<Long>> rSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> lSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> uSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> dSetMap = new HashMap<>();
		for(int i=0;i<n;i++) {
			char u = ps[i].u;
			if(u == 'U') {
				uSetMap.putIfAbsent(ps[i].x, new TreeSet<>());
				uSetMap.get(ps[i].x).add(ps[i].y);
			}
			if(u == 'D') {
				dSetMap.putIfAbsent(ps[i].x, new TreeSet<>());
				dSetMap.get(ps[i].x).add(ps[i].y);
			}
			if(u == 'R') {
				rSetMap.putIfAbsent(ps[i].y, new TreeSet<>());
				rSetMap.get(ps[i].y).add(ps[i].x);
			}
			if(u == 'L') {
				lSetMap.putIfAbsent(ps[i].y, new TreeSet<>());
				lSetMap.get(ps[i].y).add(ps[i].x);
			}
		}
		
		long min = linf;
		// u - d
		for(var key : uSetMap.keySet()) {
			var uSet = uSetMap.get(key);
			var dSet = dSetMap.get(key);
			if (dSet == null)continue;
			dSet.add((long)inf);
			for(var uy : uSet) {
				var dy = dSet.higher(uy);
				min = min(min, (dy - uy) * 5);
			}
		}
		// r - l
		for(var key : rSetMap.keySet()) {
			var rSet = rSetMap.get(key);
			var lSet = lSetMap.get(key);
			if (lSet == null)continue;
			lSet.add((long)inf);
			for(var rx : rSet) {
				var lx = lSet.higher(rx);
				min = min(min, (lx - rx) * 5);
			}
		}
		
		//cross
		Map<Long, TreeSet<Long>> rPSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> lPSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> uPSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> dPSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> rDSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> lDSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> uDSetMap = new HashMap<>();
		Map<Long, TreeSet<Long>> dDSetMap = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			char u = ps[i].u;
			var plus = ps[i].x + ps[i].y;
			var dif = ps[i].x - ps[i].y;
			if(u == 'U') {
				uPSetMap.putIfAbsent(plus, new TreeSet<>());
				uDSetMap.putIfAbsent(dif, new TreeSet<>());
				uPSetMap.get(plus).add(ps[i].x);
				uDSetMap.get(dif).add(ps[i].x);
			}
			if(u == 'D') {
				dPSetMap.putIfAbsent(plus, new TreeSet<>());
				dDSetMap.putIfAbsent(dif, new TreeSet<>());
				dPSetMap.get(plus).add(ps[i].x);
				dDSetMap.get(dif).add(ps[i].x);
			}
			if(u == 'R') {
				rPSetMap.putIfAbsent(plus, new TreeSet<>());
				rDSetMap.putIfAbsent(dif, new TreeSet<>());
				rPSetMap.get(plus).add(ps[i].x);
				rDSetMap.get(dif).add(ps[i].x);
			}
			if(u == 'L') {
				lPSetMap.putIfAbsent(plus, new TreeSet<>());
				lDSetMap.putIfAbsent(dif, new TreeSet<>());
				lPSetMap.get(plus).add(ps[i].x);
				lDSetMap.get(dif).add(ps[i].x);
			}
		}
		// r - u
		for(var key : rPSetMap.keySet()) {
			var rPSet = rPSetMap.get(key);
			var uPSet = uPSetMap.get(key);
			if(uPSet == null)continue;
			uPSet.add((long)inf);
			for(var rx : rPSet) {
				var ux = uPSet.higher(rx);
				min = min(min, (ux - rx) * 10);
			}
		}
		// d - l
		for(var key : dPSetMap.keySet()) {
			var dPSet = dPSetMap.get(key);
			var lPSet = lPSetMap.get(key);
			if(lPSet == null)continue;
			lPSet.add((long)inf);
			for(var dx : dPSet) {
				var lx = lPSet.higher(dx);
				min = min(min, (lx - dx) * 10);
			}
		}
		// l - u
		for(var key : uDSetMap.keySet()) {
			var uDSet = uDSetMap.get(key);
			var lDSet = lDSetMap.get(key);
			if(lDSet == null)continue;
			lDSet.add((long)inf);
			for(var ux : uDSet) {
				var lx = lDSet.higher(ux);
				min = min(min, (lx - ux) * 10);
			}
		}
		// r - d
		for(var key : rDSetMap.keySet()) {
			var rDSet = rDSetMap.get(key);
			var dDSet = dDSetMap.get(key);
			if(dDSet == null)continue;
			dDSet.add((long)inf);
			for(var rx : rDSet) {
				var dx = dDSet.higher(rx);
				min = min(min, (dx - rx) * 10);
			}
		}
		
		if(min > 4000000) {
			out.println("SAFE");
			return;
		}
		out.println(min);
	}	
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = (long) 1e9 + 7;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10, pi = Math.PI;
	static StringBuilder sb = new StringBuilder();
	
	//libraries
	static void printAll(int[] a) {
		Arrays.stream(a).forEach(i->out.print(i + " "));
		out.println();
	}
	static void printAll(long[] a) {
		Arrays.stream(a).forEach(i->out.print(i + " "));
		out.println();
	}
	static void printAll(int[] a, int add) {
		Arrays.stream(a).forEach(i->out.print(i + add + " "));
		out.println();
	}
	static void printAll(long[] a, long add) {
		Arrays.stream(a).forEach(i->out.print(i + add + " "));
		out.println();
	}
	static List<Integer>[] makeTree(List<Integer>[] graph, int vertexNum, int edgeNum) {
		graph = new ArrayList[vertexNum];
		for(int i=0;i<vertexNum;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<edgeNum;i++) {
			int u = ni()-1, v = ni()-1;
			graph[u].add(v);
			graph[v].add(u);
		}
		return graph;
	}
	static long[] cum(int a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long[] cum(long a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long sum(int a[]) {
		long res = 0;
		for(int i=0;i<a.length;i++) res += a[i];
		return res;
	}
	static long sum(long a[]) {
		long res = 0;
		for(int i=0;i<a.length;i++) res += a[i];
		return res;
	}
	static void reverse(int ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(long ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(double ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(char ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static String getReverse(String s) {
		char c[] = s.toCharArray();
		reverse(c);
		s = String.valueOf(c);
		return s;
	}
	static <T> void reverse(List<T> ls) {
		int sz = ls.size();
		for (int i = 0; i < sz / 2; i++) {
			T t = ls.get(i);
			ls.set(i, ls.get(sz - 1 - i));
			ls.set(sz - 1 - i, t);
		}
	}
	static <T> void reverse(T[] ar) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			T t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void sbnl() {//StringBuilderに改行文字をappendする
		sb.append("\n");
	}
	static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rlowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rupperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int lowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int upperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rlowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rupperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int lowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int upperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rlowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rupperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int lowerBound(char[] a, char x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int upperBound(char[] a, char x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rlowerBound(char[] a, char x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static int rupperBound(char[] a, char x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
	static <T> int lowerBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
	static <T> int rlowerBound(List<T> ls, T x) {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char x, char arr[]) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char arr[], char x) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static int max(int x, int y) {
		return Math.max(x, y);
	}
	static int min(int x, int y) {
		return Math.min(x, y);
	}
	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static void sort(int[] ar) {
		Arrays.sort(ar);
	}
	static void sort(long[] ar) {
		Arrays.sort(ar);
	}
	static void sort(double[] ar) {
		Arrays.sort(ar);
	}
	static void sort(char[] ar) {
		Arrays.sort(ar);
	}
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(char[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}
	static void fill(boolean arr[], boolean x) {
		Arrays.fill(arr, x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}
	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(boolean arr[][], boolean x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	
	@SuppressWarnings("unused")
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	@SuppressWarnings("unused")
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
