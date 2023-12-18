import java.util.*;

class DSU {
	private int n;
	private int[] parentOrSize;

	public DSU(int n) {
		this.n = n;
		this.parentOrSize = new int[n];
		Arrays.fill(parentOrSize, -1);
	}

	int merge(int a, int b) {
		if (!(0 <= a && a < n))
			throw new IndexOutOfBoundsException("a=" + a);
		if (!(0 <= b && b < n))
			throw new IndexOutOfBoundsException("b=" + b);

		int x = leader(a);
		int y = leader(b);
		if (x == y) return x;
		if (-parentOrSize[x] < -parentOrSize[y]) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		parentOrSize[x] += parentOrSize[y];
		parentOrSize[y] = x;
		return x;
	}

	boolean same(int a, int b) {
		if (!(0 <= a && a < n))
			throw new IndexOutOfBoundsException("a=" + a);
		if (!(0 <= b && b < n))
			throw new IndexOutOfBoundsException("b=" + b);
		return leader(a) == leader(b);
	}

	int leader(int a) {
		if (parentOrSize[a] < 0) {
			return a;
		} else {
			parentOrSize[a] = leader(parentOrSize[a]);
			return parentOrSize[a];
		}
	}

	int size(int a) {
		if (!(0 <= a && a < n))
			throw new IndexOutOfBoundsException("" + a);
		return -parentOrSize[leader(a)];
	}

	ArrayList<ArrayList<Integer>> groups() {
		int[] leaderBuf = new int[n];
		int[] groupSize = new int[n];
		for (int i = 0; i < n; i++) {
			leaderBuf[i] = leader(i);
			groupSize[leaderBuf[i]]++;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			result.add(new ArrayList<>(groupSize[i]));
		}
		for (int i = 0; i < n; i++) {
			result.get(leaderBuf[i]).add(i);
		}
		result.removeIf(ArrayList::isEmpty);
		return result;
	}
}

public class Main {
    static final long BIG = 1_000_000_000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        DSU G = new DSU(N);
        for(int q=0; q<Q; q++){
            int t = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(t==0) G.merge(u,v);
            else System.out.println(G.same(u, v) ? 1 : 0);
        }
    }
}