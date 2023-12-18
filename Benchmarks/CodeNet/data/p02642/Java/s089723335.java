import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<Integer> buf = new TreeSet<>();
    Set<Integer> tyofuku = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (buf.contains(a)) tyofuku.add(a);
      else buf.add(a);
    }

    n = buf.size();
    int[] a = new int[n];
    int tmp = 0;
    Set<Integer> idx = new HashSet<>();
    for (int m : buf) {
      a[tmp] = m;
      idx.add(tmp++);
    }

    int pos = 0;
    while (pos < n) {
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

    System.out.println(idx.size() - tyofuku.size());

  }
}
