import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Union Find Tree
        UnionFindTree uft = new UnionFindTree(n);

        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            // Put `a` and `b` into the same group
            uft.unite(a, b);
        }
        
        // Number of members in each groups
        int counts[] = new int[n];
        for (int i = 0; i < n; ++i) {
            counts[i] = 0;
            uft.root(i);
        }

        for (int i = 0; i < n; ++i) {
            int root = uft.root(i);
            counts[root] += 1;
        }

        // Number of members of the largest group
        int max = 0;
        for (int c : counts) {
            max = Math.max(max, c);
        }

        System.out.println(max);
    }
}

class UnionFindTree {
    int size;
    // ancestors[i] is the ancestor node of `i`
    int ancestors[];

    public UnionFindTree(int size) {
        this.size = size;
        this.ancestors = new int[this.size];

        for (int i = 0; i < this.size; ++i) {
            // initialize a parent of `i` as `i`
            this.ancestors[i] = i;
        }
    }

    // Put node `a` and node `b` in the same group
    public void unite(int a, int b) {
        int root_a = this.root(a);
        int root_b = this.root(b);

        // already in the same group
        if (root_a == root_b) {
            return;
        }


        this.ancestors[a] = this.ancestors[b];
    }

    // Check if `a` and `b` are in the same group
    public boolean same(int a, int b) {
        int root_a = this.root(a);
        int root_b = this.root(b);

        // `a` and `b` are in the same group if the root of `a` == the root of `b`
        return root_a == root_b;
    }

    // Get a root node of `a`
    public int root(int a) {
        // `a` is the root node
        if (this.ancestors[a] == a) {
            return a;
        }

        int parent = this.ancestors[a];
        // Replace the parent of `a` into the root of `a`
        this.ancestors[a] = this.root(parent);

        return this.ancestors[a];
    }
}

