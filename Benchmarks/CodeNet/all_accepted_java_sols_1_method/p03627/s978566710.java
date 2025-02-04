import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if(map.containsKey(a[i])) {
        map.put(a[i], map.get(a[i]) + 1);
      } else {
        map.put(a[i], 1);
      }
    }
    ArrayList<Long> edge = new ArrayList<Long>();
    for(long key : map.keySet()) {
      if(map.get(key) > 1) edge.add(key);
    }
    Collections.sort(edge);
    long ans = 0;
    if(edge.size() > 1) {
      if(map.get(edge.get(edge.size() - 1)) >= 4) {
        ans = edge.get(edge.size() - 1) * edge.get(edge.size() - 1);
      } else {
        ans = edge.get(edge.size() - 1) * edge.get(edge.size() - 2);
      }
    } else if(edge.size() == 1) {
      if(map.get(edge.get(0)) >= 4) ans = edge.get(0) * edge.get(0);
    }
    System.out.println(ans);
  }
}