import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int[] a = sc.nextIntArray(n);
		int[] b = sc.nextIntArray(n);
		
		TreeSet<Pair> a_uni = new TreeSet<>();
		TreeSet<Pair> b_uni = new TreeSet<>();
		TreeSet<Pair> a_common = new TreeSet<>();
		TreeSet<Pair> b_common = new TreeSet<>();
		
		TreeMap<Integer, Integer> a_map = new TreeMap<>();
		TreeMap<Integer, Integer> b_map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			int c = a_map.getOrDefault(a[i], 0) + 1;
			a_map.put(a[i], c);
		}
		
		for(int i = 0; i < n; i++) {
			int c = b_map.getOrDefault(b[i], 0) + 1;
			b_map.put(b[i], c);
		}
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int z = 0;
		while(!a_map.isEmpty()) {
			Entry<Integer, Integer> e = a_map.pollFirstEntry();
			if(!b_map.containsKey(e.getKey())) {
				a_uni.add(new Pair(e.getKey(), e.getValue(), z++));
				map.put(e.getKey(), z - 1);
			} else {
				a_common.add(new Pair(e.getKey(), e.getValue(), z++));
				b_common.add(new Pair(e.getKey(), b_map.get(e.getKey())));
				b_map.remove(e.getKey());
				map.put(e.getKey(), z - 1);
			}
		}
		
		while(!b_map.isEmpty()) {
			Entry<Integer, Integer> e = b_map.pollFirstEntry();
			b_uni.add(new Pair(e.getKey(), e.getValue()));
		}
		
		Stack<Integer>[] list = new Stack[z];
		for(int i = 0; i < z; i++)
			list[i] = new Stack<>();
		
		boolean flag = true;
		while(!b_common.isEmpty()) {
			Pair x = b_common.pollLast();
			Pair temp = null;
			while(true) {
				if(x.c == 0 || a_common.isEmpty())
					break;
				Pair y = a_common.pollFirst();
				if(y.n == x.n) {
					temp = y;
					continue;
				}
				int min = Math.min(y.c, x.c);
				y.c -= min;
				x.c -= min;
				if(y.c != 0)
					a_common.add(y);
				while(min-->0)
					list[y.i].add(x.n);
			}
			
			if(temp != null)
				a_common.add(temp);
			
			if(x.c != 0) {
				while(true) {
					if(x.c == 0 || a_uni.isEmpty())
						break;
					Pair y = a_uni.pollFirst();
					int min = Math.min(y.c, x.c);
					y.c -= min;
					x.c -= min;
					if(y.c != 0)
						a_uni.add(y);
					while(min-->0)
						list[y.i].add(x.n);
				}
			}
			
			if(x.c > 0) {
				flag = false;
				break;
			}
		}
		
		while(!b_uni.isEmpty()) {
			Pair x = b_uni.pollLast();
			while(true) {
				if(x.c == 0 || a_common.isEmpty())
					break;
				Pair y = a_common.pollFirst();
				int min = Math.min(y.c, x.c);
				y.c -= min;
				x.c -= min;
				if(y.c != 0)
					a_common.add(y);
				while(min-->0)
					list[y.i].add(x.n);
			}
			
			if(x.c != 0) {
				while(true) {
					if(x.c == 0 || a_uni.isEmpty())
						break;
					Pair y = a_uni.pollFirst();
					int min = Math.min(y.c, x.c);
					y.c -= min;
					x.c -= min;
					if(y.c != 0)
						a_uni.add(y);
					while(min-->0)
						list[y.i].add(x.n);
				}
			}
			
			if(x.c > 0) {
				flag = false;
				break;
			}
		}
		
		pw.println(flag ? "Yes" : "No");
		if(flag) {
			int[] ans = new int[n];
			for(int i = 0; i < n; i++) {
				int x = map.get(a[i]);
				ans[i] = list[x].pop();
			}
			for(int i = 0; i < n; i++)
				pw.print(ans[i] + (i == n - 1 ? "\n" : " "));
		}
		pw.flush();
	}
	
	public static class Pair implements Comparable<Pair> {
		int n, c;
		int i;
		
		public Pair(int n, int c, int i) {
			this(n, c);
			this.i = i;
		}
		
		public Pair(int n, int c) {
			this.n = n;
			this.c = c;
		}
		
		public int compareTo(Pair p) {
			if(this.c == p.c)
				return p.n - this.n;
			return p.c - this.c;
		}
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++)
				array[i] = new Integer(nextInt());
			return array;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		public static int[] shuffle(int[] a) {
			int n = a.length;
			Random rand = new Random();
			for (int i = 0; i < n; i++) {
				int tmpIdx = rand.nextInt(n);
				int tmp = a[i];
				a[i] = a[tmpIdx];
				a[tmpIdx] = tmp;
			}
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
