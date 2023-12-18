import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    int sum = 0;
    for(int i = 0; i < n; ++i) {
      num[i] = sc.nextInt();
      sum += num[i];
    }
    int res1 = 0;
    int res2 = 0;
    int mid1 = sum / n;
    int mid2 = sum / n + 1;
    for(int i = 0; i < n; ++i) {
      int cur1 = Math.abs(mid1 - num[i]);
      int cur2 = Math.abs(mid2 - num[i]);
      res1 += cur1 * cur1;
      res2 += cur2 * cur2;
    }
    System.out.println(Math.min(res1, res2));
  }
}