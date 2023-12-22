import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ans = new int[n];
    int p = 0;
    for(int i = 11; i < 55555; i++) {
      if(p >= n) break;
      if(i % 5 == 1) {
      int f = 0;
      for(int j = 2; j * j <= i; j++) {
        if(i % j == 0) {
          f++;
          break;
        }
      }
      if(f == 0) {
        ans[p] = i;
        p++;
      }
      }
    }
    for(int i = 0; i < n; i++) {
      if(i < n - 1) System.out.print(ans[i] + " ");
      if(i == n - 1) System.out.print(ans[i]);
    }
  }
}