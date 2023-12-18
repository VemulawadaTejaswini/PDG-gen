import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n;
    int m;
    while(true) {
      n = sc.nextInt();
      m = sc.nextInt();
      if (n == 0 && m == 0) return;
      int a[] = new int[n];
      for (int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
      int max = 0;
      for (int i = 0; i < n-1; i++) {
        for (int j = 1; j < n; j++) {
          if (i != j && a[i] + a[j] <= m) {
            if (a[i] + a[j] > max) {
              max = a[i] + a[j];
            }
          }
        }
      }
      System.out.println(max == 0 ? "NONE" : max);
    }
  }
}

