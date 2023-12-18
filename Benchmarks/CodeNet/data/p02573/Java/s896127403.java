import java.util.*;

public class Main {
  static int[] par;
  static int[] rank;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    par = new int[n];
    rank = new int[n];
    init(n);
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      unite(a, b);
    }
    int ans = 0;
    int[] t = new int[n];
    for(int i = 0; i < n; i++) {
      t[find(i)]++;
    }
    for(int i = 0; i < n; i++) {
      ans = Math.max(ans, t[i]);
    }
    System.out.println(ans);
  }
  static void init(int m) {
      for(int i = 0; i < m; i++) {
        par[i] = i;
        rank[i] = 1;
      }
    }
  static int find(int x) {
      if(par[x] == x) {
        return x;
      } else {
        return par[x] = find(par[x]);
      }
    }
  static void unite(int x, int y) {
      x = find(x);
      y = find(y);
      if(x != y) {
        if(rank[x] < rank[y]) {
          par[x] = y;
          rank[y] += rank[x];
        } else {
          if(rank[x] == rank[y]) {
            if(x > y) {
              par[x] = y;
              rank[y] += rank[x];
            } else {
              par[y] = x;
              rank[x] += rank[y];
            }
          } else {
            par[y] = x;
            rank[x] += rank[y];
          }
        }
      }
    }
  static boolean same(int x, int y) {
      return find(x) == find(y);
    }
}