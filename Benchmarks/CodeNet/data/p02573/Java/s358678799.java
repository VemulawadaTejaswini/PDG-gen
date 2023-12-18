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
        
        // Number of members of the largest group
        int max = 0;
        for (int i = 0; i < n; ++i) {
            max = Math.max(max, uft.size(i));
        }

        System.out.println(max);
    }
}

class UnionFindTree {
    int size;
    // ancestors[i] is the ancestor node of `i`
    int ancestors[];
    // Number of members of the group
    int counts[];

    public UnionFindTree(int size) {
        this.size = size;
        this.ancestors = new int[this.size];
        this.counts = new int[this.size];

        for (int i = 0; i < this.size; ++i) {
            // initialize a parent of `i` as `i`
            this.ancestors[i] = i;
            this.counts[i] = 1;
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
        else if (this.counts[root_a] > this.counts[root_b]) {
            this.ancestors[root_b] = this.ancestors[root_a];
            this.counts[root_a] += this.counts[root_b];
        }
        else {
            this.ancestors[root_a] = this.ancestors[root_b];
            this.counts[root_b] += this.counts[root_a];
        }
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

        // Replace the parent of `a` into the root of `a`
        int root = this.root(this.ancestors[a]);
        this.ancestors[a] = root;
        this.counts[a] = this.counts[root];

        return root;
    }

    public int size(int a) {
        int root = this.root(a);
        return this.counts[root];
    }
}

