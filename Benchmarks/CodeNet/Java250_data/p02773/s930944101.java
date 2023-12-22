import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    // System.out.println(main.solve());
    main.solve();
  }

  int n;
  Map<String, Integer> map;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      map = new HashMap<String, Integer>();
      for (int i = 0; i < n; i++) {
        String s = sc.next();
        if (map.containsKey(s)) {
          map.put(s, map.get(s) + 1);
        } else {
          map.put(s, 0);
        }
      }
    } finally {
      sc.close();
    }
  }

  void solve() {
    int v = maxi();
    List<String> list = new ArrayList<String>();
    for (String s: map.keySet()) {
      if (map.get(s) == v) list.add(s);
    }
    Collections.sort(list);
    for (String s: list) {
      System.out.println(s);
    }
  }

  int maxi() {
    int ans = 0;
    for (String s: map.keySet()) {
      if (ans < map.get(s)) ans = map.get(s);
    }
    return ans;
  }
}
