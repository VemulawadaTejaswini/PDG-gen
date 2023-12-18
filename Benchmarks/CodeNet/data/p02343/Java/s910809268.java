import java.util.*;

class MainA {
  static final int MAX = 10000;
  static int[] rank = new int[MAX];
  static int[] par = new int[MAX];
  static ArrayList<Integer> ansArr = new ArrayList<Integer>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    for(int i = 0 ; i < n ; i++) {
      rank[i] = 0;
      par[i] = i;
    }

    int com, x, y;
    for(int i = 0 ; i < q ; i++) {
      com = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();
      if(com == 0) unite(x, y);
      else same(x, y);
    }

    // 答え出力
    for(Integer ans: ansArr) System.out.println(ans);
  }

  static int find(int x) {
    if(x == par[x]) return x;
    else return par[x] = find(par[x]);
  }

  static void unite(int x, int y) {
    x = find(x);
    y = find(y);
    if(x == y) return;

    if(rank[x] < rank[y]) {
      par[x] = y;
    } else {
      par[y] = x;
      if(rank[x] == rank[y]) rank[y]++;
    }
  }

  static void same(int x, int y) {
    x = find(x);
    y = find(y);
    if(x == y) ansArr.add(1);
    else ansArr.add(0);
  }
}

