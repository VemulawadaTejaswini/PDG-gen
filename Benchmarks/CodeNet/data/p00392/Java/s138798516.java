import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        UnionFind uf = new UnionFind();
        for (int ai : a) {
            int value = ai;
            for (int i = 2; i * i <= ai; i++) {
                if (value % i == 0) {
                    uf.unite(ai, i);
                    while (value % i == 0) value /= i;
                }
            }
            if(value != 1) {
                uf.unite(ai, value);
            }
        }
        int[] asorted = a.clone();
        Arrays.sort(asorted);
        for (int i = 0; i < n; i++) {
            if(!uf.isSameRoot(a[i], asorted[i])) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}

class UnionFind {
    int[] data = new int[100010];

    UnionFind() {
        for (int i = 0; i < 100010; i++) {
            data[i] = i;
        }
    }

    void unite(int left, int right) {
        data[root(left)] = root(right);
    }

    int root(int i) {
        if (data[i] == i) return i;
        else return data[i] = root(data[i]);
    }

    boolean isSameRoot(int x, int y) {
        return root(x) == root(y);
    }
}
