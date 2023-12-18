import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    int m = (int)a[n - 1];
    int[] b = new int[m + 1];
    int ans = 1;
    if((n > 1) && (a[0] == a[1])) ans = 0;
    for(int i = 0; i < n; i++) {
      if(b[(int)a[i]] == 0) {
        for(int j = (int)(2 * a[i]); j < m + 1; j += ((int)a[i])) {
          if(b[j] == 0) b[j] = 1;
        }
      }
    }
    for(int i = 1; i < n; i++) {
      if(a[i] != a[i - 1]) {
        if(i == (n - 1)) {
          if(b[(int)a[i]] == 0) ans++;
        } else if(a[i] != a[i + 1]) {
          if(b[(int)a[i]] == 0) ans++;
        }
      }
    }
    System.out.println(ans);
  }
}