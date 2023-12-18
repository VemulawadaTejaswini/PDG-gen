import java.util.*;

public class Main {

    private static int[] g;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        g = new int[N];
        for (int i = 0; i < N; i++) {
            g[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            A--;
            int B = sc.nextInt();
            B--;
            unite(A, B);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(root(g[i]));
        }

        System.out.println(set.size()-1);
    }

    private static int root(int n) {
        if (g[n] == n) return n;
        return g[n] = root(g[n]);
    }

    private static void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry) return;
        g[rx] = ry;
    }
}
