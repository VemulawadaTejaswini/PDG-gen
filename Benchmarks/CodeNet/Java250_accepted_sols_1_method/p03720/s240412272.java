import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    int[] c = new int[n];
    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      c[i] = 0;
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i] == j + 1) {
          c[j]++;
        }
        if (b[i] == j + 1) {
          c[j]++;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(c[i]);
    }
  }
}