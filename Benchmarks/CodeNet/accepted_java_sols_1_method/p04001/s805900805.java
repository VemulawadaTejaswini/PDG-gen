import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int[] num = new int[n];
    for(int i = 0; i < n; i++) {
      num[i] = Integer.parseInt(String.valueOf(s.charAt(n - 1 - i)));
    }
    long ans = 0;
    for(int i = 0; i < (int)Math.pow(2, n); i++) {
      int p = 0;
      if((i & 1) == 0) {
        for(int j = 0; j < n; j++) {
          if((i & (1 << j)) != 0) {
            p = 0;
            ans += ((long)num[j] * (long)Math.pow(10, p));
            p++;
          } else {
            ans += ((long)num[j] * (long)Math.pow(10, p));
            p++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}