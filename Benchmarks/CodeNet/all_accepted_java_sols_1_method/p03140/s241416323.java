import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][26];
    for(int i = 0; i < 3; i++) {
      String s = sc.next();
      for(int j = 0; j < n; j++) {
        int t = s.charAt(j) - 'a';
        a[j][t]++;
      }
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      int m = 0;
      for(int j = 0; j < 26; j++) {
        m = Math.max(m, a[i][j]);
      }
      ans += (3 - m);
    }
    System.out.println(ans);
  }
}