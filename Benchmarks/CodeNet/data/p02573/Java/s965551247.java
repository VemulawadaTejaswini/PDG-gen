import java.util.*;

public class Main {

    static int[] g;
    static int[] size;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        g = new int[N]; 
        size  = new int[N]; 
        for (int i = 0; i < N; i++) {
            g[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            if (root(A) == root(B)) continue;
            unite(A,B);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max,size[i]);
        }

        System.out.println(max);
    }

    private static int root(int n) {
        if (g[n] == n) return n;
        return g[n] = root(g[n]);
    }

    private static void unite(int A, int B) {
        int rootA = root(A);
        int rootB = root(B);
        if (rootA == rootB) return;
        if (size[rootA] >= size[rootB]) {
            g[rootB] = rootA;
            size[rootA] += size[rootB];
        } else {
            g[rootA] = rootB;
            size[rootB] += size[rootA];
        }
    }
}
