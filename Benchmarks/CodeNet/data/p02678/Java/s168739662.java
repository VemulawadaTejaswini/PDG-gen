import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            a[i]--;
            b[i]--;
        }
        sc.close();

        UnionFind tree = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            tree.unite(a[i], b[i]);
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (tree.same(0,i)) cnt ++;
        }
        if (cnt == n) {
            System.out.println("Yes");
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[j] == i){
                        System.out.println(b[i]);
                        break;
                    } 
                    if (b[j] == i) {
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No");
        }

        
    }
}

class UnionFind {
    int[] date = new int[1000000];
    UnionFind (int n) {
        for (int i = 0; i < n+1; i++) {
            this.date[i] = -1;
        }
    }
    public int find(int x) {
        if (this.date[x] < 0) return x;
        else {
            this.date[x] = find(this.date[x]);
            return this.date[x];
        }
    }
    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (this.date[x] < this.date[y]) {
                this.date[x] += this.date[y];
                this.date[y] = x;
            } else {
                this.date[y] += this.date[x];
                this.date[x] = y;
            }
        }
    }
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
    public int size(int x) {
        return -this.date[find(x)];
    }
}