import java.util.*;

public class Main {

static class UnionFind {
    List<Integer> Parent;
    UnionFind(int N) {
        Parent = new ArrayList<Integer>();
        Integer[] values = new Integer[N];
        Arrays.fill(values, -1);
        Parent.addAll(Arrays.asList(values));
    }
    int root(int A) {
        if (Parent.get(A) < 0)
            return A;
        int root = root(Parent.get(A));
        Parent.set(A, root);
        return root;
    }
    int size(int A) {
        return -Parent.get(root(A));
    }

    boolean connect(int A, int B) {
        A = root(A);
        B = root(B);
        if (A == B) {
            return false;
        }

        if (size(A) < size(B)) {
            int temp = A;
            A = B;
            B = temp;
        }

        Parent.set(A, Parent.get(A) + Parent.get(B));
        Parent.set(B, A);

        return true;
    }
}

	static int N;
	static ArrayList<TreeSet<Integer>> edge;
	static ArrayList<ArrayList<Integer>> edge_;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		edge = new ArrayList<TreeSet<Integer>>();
		for (int i=0;i<N;i++) {
			TreeSet<Integer> add = new TreeSet<Integer>();
			edge.add(add);
		}
		for (int i=0;i<N-1;i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			edge.get(u).add(v);
			edge.get(v).add(u);
		}
		edge_ = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<N;i++) {
			ArrayList<Integer> add = new ArrayList<Integer>(edge.get(i));
			edge_.add(add);
		}

		long final_ans = 0L;

		long ans = 0L;
		long tmp_cnt = 0;
		UnionFind uf = new UnionFind(N);
		for (int i=0;i<N;i++) {
			tmp_cnt++;
			for (Integer tmp : edge.get(i)) {
				if (tmp < i) {
					if (uf.root(tmp) != uf.root(i)) tmp_cnt--;
					uf.connect(tmp, i);
				}
			}
			ans += tmp_cnt;
		}
		final_ans += ans;

		for (int i=0;i<N;i++) {
			int tmp_cntt = N-i;
			ArrayList<Integer> aaaaa = new ArrayList<Integer>(edge_.get(i));
			// tmp_cntt -= edge.get(i).size()-(~Collections.binarySearch(aaaaa, i, (o1, o2)->(o1>=o2?1:-1)));
			tmp_cntt -= (~Collections.binarySearch(aaaaa, i, (o1, o2)->(o1>=o2?1:-1)));
			ans -= tmp_cntt;
			final_ans += ans;
			System.out.println("tmp_cntt: "+(tmp_cntt));
			System.out.println("ans: "+(ans));
		}
		System.out.println(final_ans);
	}
}