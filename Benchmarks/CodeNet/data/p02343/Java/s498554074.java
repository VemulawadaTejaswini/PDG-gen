import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();

        WeightedUnionFindTree uft = new WeightedUnionFindTree(N);
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (q[0] == 0) {
                uft.merge(q[1], q[2]);
            } else {
                System.out.println(uft.same(q[1], q[2]) ? 1: 0);
            }
        }
    }

}

class WeightedUnionFindTree {
    int size;
    int[] par;
    int[] rank;
    int[] weight;

    public WeightedUnionFindTree(int size) {
        this.size = size;
        par = new int[size];
        for (int i = 0; i < size; i++) {
            par[i] = i;
        }
        rank = new int[size];
        Arrays.fill(rank, 1);
        weight= new int[size];
    }

    private int root(int x) {
        if (x == par[x]) {
            return x;
        }
        int root = root(par[x]);
        par[x] = root;
        // cSum
        weight[x] += weight[par[x]];
        return root;
    }

    private int weight(int x) {
        root(x);
        return weight[x];
    }

    public int diff(int x, int y) {
        return weight(y) - weight(x);
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public void merge(int x, int y) {
        merge(x, y, 1);
    }

    public void merge(int x, int y, int w) {
        w += weight[x];
        w -= weight[y];

        int xr = root(x);
        int yr = root(y);

        if (xr == yr) {
            return;
        }

        if (rank[xr] < rank[yr]) {
            par[xr] = yr;
            weight[y] = -w;
        } else {
            par[yr] = xr;
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
            weight[x] = w;
        }
    }

}

