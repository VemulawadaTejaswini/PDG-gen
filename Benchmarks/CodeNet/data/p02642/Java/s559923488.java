import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    Set idx = new HashSet();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      idx.add(i);
    }

    Arrays.sort(a);

    int pos = 0;
    while (pos < n) {

      if (a[pos] > 1000) break;

      if (!idx.contains(pos)) {
        pos++; continue;
      }

      int d = a[pos];
      if (pos < n && d == a[pos + 1]) {
        idx.remove(pos);
      }

      pos++;
      for (int i = pos; i < n; i++) {
        if (idx.contains(i) && a[i] % d == 0)  {
          idx.remove(i);
        }
      }
    }

    System.out.println(idx.size());

  }
}
