import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int b[] = new int[m];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0; i < m; i++) {
      b[i] = Integer.parseInt(sc.next());
    }
    int ans = 0;
    int aRead = 0;
    int bRead = 0;
    long totalCost = 0;
    while (totalCost <= k) {
      if (aRead < n && bRead < m) {
        int aCost = a[aRead];
        int bCost = b[bRead];
        if (aCost <= bCost) {
          totalCost += aCost;
          aRead++;
        } else {
          totalCost += bCost;
          bRead++;
        }
        if (totalCost <= k) {
          ans++;
        } else {
          break;
        }
      } else if (aRead < n && bRead >= m) {
        totalCost += a[aRead];
        aRead++;
        if (totalCost <= k) {
          ans++;
        } else {
          break;
        }
      } else if (aRead >= n && bRead < m) {
        totalCost += b[bRead];
        bRead++;
        if (totalCost <= k) {
          ans++;
        } else {
          break;
        }
      } else {
        break;
      }
    }
    pw.println(ans);
  }
}
