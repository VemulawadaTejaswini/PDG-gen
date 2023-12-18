import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int V = sc.nextInt();
		int E = sc.nextInt();
		
		List<List<Integer>> edges = new LinkedList<>();
		for(int i=0;i<E;i++) {
			edges.add(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		edges.sort((a,b)-> Integer.compare(a.get(2), b.get(2)));
		
		int ans = 0;
		
		UnionFind uf = new UnionFind(V);
		for(List<Integer> e :edges) {
			int s = e.get(0);
			int t = e.get(1);
			int w = e.get(2);
			
			if(!uf.same(s, t)) {
//				System.err.println(s + "," + t + "," + w);
				ans += w;
				uf.unite(s, t);
			}
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
class UnionFind {

	int[] par;

	public UnionFind(int size) {
		par = new int[size];
		Arrays.fill(par, -1);
	}

	public int root(int x) {
		if(par[x]<0) {
			return x;
		}
		int z = root(par[x]);
		par[x] = z;
		return z;
	}

	public boolean same(int a, int b) {
		return root(a) == root(b);
	}

	public void unite(int a, int b) {
		if(!same(a,b)) {
			int ra = root(a);
			int rb = root(b);

			if(par[ra] < par[rb]) {
				par[ra] += par[rb];
				par[rb] = ra;
			}else {
				par[rb] += par[ra];
				par[ra] = rb;
			}
		}
	}

	public int size(int a) {
		return -par[root(a)];
	}

	public static void main(String[] args) {
		UnionFind uni = new UnionFind(10);
		System.out.println(Arrays.toString(uni.par));
		uni.unite(1, 2);
		System.out.println(Arrays.toString(uni.par));
		uni.unite(3, 4);
		System.out.println(Arrays.toString(uni.par));
		uni.unite(1, 3);
		System.out.println(Arrays.toString(uni.par));
		System.out.println(uni.size(3));
		System.out.println(Arrays.toString(uni.par));
		uni.root(1);
		System.out.println(Arrays.toString(uni.par));
	}

}

