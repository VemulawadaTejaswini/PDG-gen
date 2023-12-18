import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Map<Integer, Integer> ctrMap = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (ctrMap.containsKey(a)) {
        ctrMap.put(a, ctrMap.get(a) + 1);
      } else {
        ctrMap.put(a, 1);
      }
    }

    n = ctrMap.size();
    int[] a = new int[n];
    int ctr = 0;
    int tmp = 0;
    Set<Integer> idx = new HashSet<>();
    for (int k : ctrMap.keySet()) {
      if (ctrMap.get(k) > 1) ctr++;
      a[tmp] = k;
      idx.add(tmp++);
    }

    int pos = 0;
    while (pos < n) {

      if (a[pos] > 1000) break;

      if (!idx.contains(pos)) {
        pos++; continue;
      }

      int d = a[pos];

      pos++;
      for (int i = pos; i < n; i++) {
        if (idx.contains(i) && a[i] % d == 0)  {
          idx.remove(i);
        }
      }
    }

    System.out.println(idx.size() - ctr);

  }
}
