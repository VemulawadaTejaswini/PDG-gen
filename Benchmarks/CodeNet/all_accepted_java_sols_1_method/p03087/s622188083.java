import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] sum = new int[n];
    int cnt = 0;
    for (int i = 1; i < n; i++) {
      if (s.charAt(i) == 'C') {
        if (s.charAt(i-1) == 'A') {
          cnt++;
        }
      }
      sum[i] = cnt;
    }
    int[] l = new int[q];
    int[] r = new int[q];
    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    for (int i = 0; i < q; i++) {
      int ans = (sum[r[i]-1]) - sum[l[i]-1];
      System.out.println(ans);
    }
  }
}