import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
    int p = -1;
    for(int i = 0; i < n; i++) {
      if(x[i] >= 0) {
        p = i;
        break;
      } 
    }
    int ans = Integer.MAX_VALUE;
    if(p == -1) {
      ans = (-1) * x[n - k];
    } else if(p == 0) {
      ans = x[k - 1];
    } else {
      if(x[p] == 0) {
        for(int i = 0; i <= Math.min(p, k - 1); i++) {
          if(i == k) {
            ans = Math.min(ans, (-1) * x[p - k]);
          } else {
            if((p + k - i - 1) < n) {
              if(i == 0) {
                ans = Math.min(ans, x[p + k - i - 1]);
              } else {
                ans = Math.min(ans, 2 * (-1) * x[p - i] + x[p + k - i - 1]);
                ans = Math.min(ans, (-1) * x[p - i] + 2 * x[p + k - i - 1]);
              }
            }
          }
        }
      } else {
        for(int i = 0; i <= Math.min(p, k); i++) {
          if(i == k) {
            ans = Math.min(ans, (-1) * x[p - k]);
          } else {
            if((p + k - i - 1) < n) {
              if(i == 0) {
                ans = Math.min(ans, x[p + k - i - 1]);
              } else {
                ans = Math.min(ans, 2 * (-1) * x[p - i] + x[p + k - i - 1]);
                ans = Math.min(ans, (-1) * x[p - i] + 2 * x[p + k - i - 1]);
              }
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}