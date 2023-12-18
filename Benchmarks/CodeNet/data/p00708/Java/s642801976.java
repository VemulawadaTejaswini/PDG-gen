import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while(true) {
			int n = sc.nextInt();
			
			if(n==0) {
				break;
			}
			
			double[] x = new double[n];
			double[] y = new double[n];
			double[] z = new double[n];
			double[] r = new double[n];
			
			for(int i=0;i<n;i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}
			
			List<Tuple3<Integer,Integer,Double>> edges = new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					double d = Math.sqrt( (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]) + (z[i]-z[j])*(z[i]-z[j]));
					d -= r[i] + r[j];
					d = Math.max(d, 0);
					edges.add(new Tuple3<>(i,j,d));
				}
			}
			
			
			edges.sort((a,b)->Double.compare(a.cdr.cdr.car, b.cdr.cdr.car));
			
			UnionFind uf = new UnionFind(n+1);
			double ans = 0;
			for(Tuple3<Integer,Integer,Double> e : edges) {
				int a = e.car;
				int b = e.cdr.car;
				double w = e.cdr.cdr.car;
				
				if(!uf.same(a, b)) {
					ans += w;
					uf.unite(a, b);
				}
			}
			
			out.println(String.format("%.3f", ans));
			
		}
		
		
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

class Pair<A, B> {
	A car;
	B cdr;

	public Pair(A _car, B _cdr) {
		car = _car;
		cdr = _cdr;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Pair)) {
			return false;
		}
		Pair<?, ?> p = (Pair<?, ?>) o;

		return ((car == null && p.car == null) || (car != null & car.equals(p.car))) &&
				((cdr == null && p.cdr == null) || (cdr != null & cdr.equals(p.cdr)));

	}

	@Override
	public int hashCode() {
		return (car == null ? 0 : car.hashCode()) ^ (cdr == null ? 0 : cdr.hashCode());
	}

	@Override
	public String toString() {
		return asList().toString();
	}

	public List<Object> asList() {
		List<Object> l = new ArrayList<>();
		l.add(car);
		if (cdr instanceof Pair) {
			l.addAll(((Pair<?, ?>) cdr).asList());
		}else {
			l.add(cdr);
		}
		return l;
	}
}

class Tuple1<A> extends Pair<A, Object> {
	public Tuple1(A a) {
		super(a, null);
	}

	public List<Object> asList(){
		List<Object> l = new ArrayList<>();
		l.add(car);
		return l;
	}

}

class Tuple2<A, B> extends Pair<A, Tuple1<B>> {
	public Tuple2(A a, B b) {
		super(a, new Tuple1<B>(b));
	}
}

class Tuple3<A, B, C> extends Pair<A, Tuple2<B, C>> {
	public Tuple3(A a, B b, C c) {
		super(a, new Tuple2<B, C>(b, c));
	}
}

class Tuple4<A, B, C, D> extends Pair<A, Tuple3<B, C, D>> {
	public Tuple4(A a, B b, C c, D d) {
		super(a, new Tuple3<B, C, D>(b, c, d));
	}
}

class Tuple5<A, B, C, D, E> extends Pair<A, Tuple4<B, C, D, E>> {
	public Tuple5(A a, B b, C c, D d, E e) {
		super(a, new Tuple4<B, C, D, E>(b, c, d, e));
	}
}

