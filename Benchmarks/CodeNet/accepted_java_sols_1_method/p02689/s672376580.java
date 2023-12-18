import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] h = new int[n];
    Set<Integer> goodH = new HashSet<>();
    Set<Integer> badH = new HashSet<>();
    Set<Integer> hasBridge = new HashSet<>();

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    for (int j = 0; j < m; j++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (h[a-1] > h[b-1]) {
        goodH.add(a);
        badH.add(b);
      } else if (h[a-1] < h[b-1]) {
        goodH.add(b);
        badH.add(a);
      } else {
        badH.add(a);
        badH.add(b);
      }

      hasBridge.add(a);
      hasBridge.add(b);
    }

    int noBridgeCount = 0;
    for (int i = 1; i <= n; i++) {
      if (!hasBridge.contains(i)) {
        noBridgeCount++;
      }
    }
    int goodHCount = 0;
    for (int i = 1; i <= n; i++) {
      if (goodH.contains(i) && !badH.contains(i)) {
        goodHCount++;
      }
    }

    int result = goodHCount + noBridgeCount;

    System.out.println(result);
  }
}
