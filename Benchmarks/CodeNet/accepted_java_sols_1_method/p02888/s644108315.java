import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] l = new Integer[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l, Collections.reverseOrder());
    int cnt = 0;
    for (int i = 0; i <= n-3; i++) {
      for (int j = i + 1; j <= n-2; j++) {
        boolean cuF = false;
        for (int k = j + 1; k <= n-1; k++) {
          if (l[i] < l[j] + l[k]) {
            cnt++;
            cuF = true;
            continue;
          }
          break;
        }
        if (!cuF) break;
      }
    }
    System.out.println(cnt);
  }
}