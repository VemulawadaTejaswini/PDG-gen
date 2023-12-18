import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[] a = N.toCharArray();
    int n = a.length;
    int[][] f = new int[n][2];
    f[n - 1][0] = a[n - 1] - '0';
    f[n - 1][1] = 6 - (a[n - 1] - '5');
    for(int i = n - 2; i > -1; --i) {
      int cur = Math.min(f[i+1][0], f[i+1][1]);
      f[i][0] = cur + (a[i] - '0');
      f[i][1] = Math.min(f[i+1][1] + ('9' - a[i]), f[i+1][0] + 6 - (a[i] - '5'));
    }
    System.out.println(Math.min(f[0][0], f[0][1]));
  }
}
    