
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];

        for (int i = 0 ; i < M ; i++) {
            A[i] = scanner.nextInt() - 1;
            B[i] = scanner.nextInt() - 1;
        }

        UnionFindTree uft = new UnionFindTree(N);

        for (int i = 0 ; i < M ; i++) {
            uft.union(A[i], B[i]);
        }

        Set<Integer> roots = new HashSet<>();
        for (int i = 0 ; i < N ; i++) {
            roots.add(uft.find(i));
        }

        System.out.println(roots.size() - 1);
    }

    static class UnionFindTree {
        int[] parent;

        public UnionFindTree(int n) {
            parent = new int[n];
            for (int i = 0 ; i < n ; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                parent[x] = find(parent[x]);
                return parent[x];
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

        public void union(int x, int y) {
            int rx = find(x);
            int ry = find(y);
            if (rx != ry) {
                parent[rx] = ry;
            }
        }
    }
}
