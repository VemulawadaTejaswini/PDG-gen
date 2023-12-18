import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        ArrayList<int[]> edge = new ArrayList<int[]>();
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int[] add = {s, t, d};
            edge.add(add);
        }
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[2], o2[2]);
            }
        };
        Collections.sort(edge, comparator);

        UnionFind uf = new UnionFind(V);
        long ans = 0L;
        for (int i=0;i<E;i++) {
            if (uf.root(edge.get(i)[0])!=uf.root(edge.get(i)[1])) {
                ans += edge.get(i)[2];
            }
            uf.connect(edge.get(i)[0], edge.get(i)[1]);
        }
        System.out.println(ans);
    }

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
}
