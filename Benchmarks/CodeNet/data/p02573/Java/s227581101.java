import java.util.*;
 
class Main {
    static Scanner sc;
    static int n, m;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int x, y;
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            uft.unite(x, y);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(uft.getGroupSize(i), ans);
        }
        System.out.println(ans);
    }
}

class UnionFindTree {
    int size;
    int groupNum;
    int[] parents;
    int[] heights;
    int[] groupSizes;
    
    UnionFindTree(int size) {
        parents = new int[size];
        heights = new int[size];
        groupSizes = new int[size];
        for (int i = 0; i < size; i++) {
            parents[i] = i;
            heights[i] = 0;
            groupSizes[i] = 1;
        }
        groupNum = size;
    }

    public void unite(int x, int y) {
        int x_root = findRoot(x);
        int y_root = findRoot(y);

        if (x_root == y_root) {
            return;
        }

        if (heights[x_root] > heights[y_root]) {
            parents[y_root] = x_root;
            groupSizes[x_root] += groupSizes[y_root];
        } else if (heights[x_root] < heights[y_root]) {
            parents[x_root] = y_root;
            groupSizes[y_root] += groupSizes[x_root];
        } else {
            parents[y_root] = x_root;
            heights[x_root]++;
            groupSizes[x_root] += groupSizes[y_root];
        }
        groupNum--;
    }

    public Boolean is_equiv(int x, int y) {
        return findRoot(x) == findRoot(y);
    }

    public int getGroupSize(int x) {
        int root = findRoot(x);
        return groupSizes[root];
    }

    int findRoot(int x) {
        ArrayList<Integer> paths = new ArrayList<Integer>();
        int crt = x;
        while (parents[crt] != crt) {
            paths.add(crt);
            crt = parents[crt];
        }
        for (Integer v: paths) {
            parents[v] = crt;
        }
        heights[crt] = 1;
        return crt;
    }
}