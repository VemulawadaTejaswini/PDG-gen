import java.util.ArrayList;
import java.util.Scanner;

class Main {

  static final int INF = Integer.MAX_VALUE / 4;

  static int cntAC(ArrayList<Integer> list, int l, int r) {
    int idx_l;
    int idx_r;
    // FOR LEFT lの右のindexを求める
    int ok = list.size();
    int ng = 0;
    int mid = (ok + ng) / 2;
    while (ok - ng > 1) {
      if (list.get(mid) < l) {
        ng = mid;
      } else {
        ok = mid;
      }
      mid = (ok + ng) / 2;
    }
    idx_l = ok;
    // FOR RIGHT rの左のindexを求める
    ok = 0;
    ng = list.size();
    mid = (ok + ng) / 2;
    while (ng - ok > 1) {
      if (list.get(mid) <= r) {
        ok = mid;
      } else {
        ng = mid;
      }
      mid = (ok + ng) / 2;
    }
    idx_r = ok;
    if (idx_r - idx_l < 0) {
      return 0;
    }
    return idx_r - idx_l + 1;
  }

  static ArrayList<Integer> searchAC(String s) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(-INF);
    for (int i = 0; i < s.length() - 1;) {
      if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
        list.add(i);
        i = i + 2;
      } else {
        i = i + 1;
      }
    }
    list.add(INF);
    return list;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int Q = Integer.parseInt(scanner.next());
    String s = scanner.next();
    int[] l = new int[Q];
    int[] r = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = Integer.parseInt(scanner.next());
      r[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list = searchAC(s);

    //System.out.println(list);

    for (int i = 0; i < Q; i++) {
      System.out.println(cntAC(list, l[i] - 1, r[i] - 2));
    }

  }

}
