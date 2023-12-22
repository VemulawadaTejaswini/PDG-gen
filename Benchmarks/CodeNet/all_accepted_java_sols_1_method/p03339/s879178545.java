import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int[] e1 = new int[n];
    int[] w1 = new int[n];
    int[] e2 = new int[n];
    int[] w2 = new int[n];
    for(int i = 0; i < n; i++) {
      if(i == 0) {
        if(s.charAt(i) == 'E') {
          e1[0] = 1;
        } else { 
          w1[0] = 1;
        }
      } else {
        if(s.charAt(i) == 'E') {
          e1[i] = e1[i - 1] + 1;
          w1[i] = w1[i - 1];
        } else {
          e1[i] = e1[i - 1];
          w1[i] = w1[i - 1] + 1;
        }
      }
    }
    for(int i = n - 1; i >= 0; i--) {
      if(i == (n - 1)) {
        if(s.charAt(i) == 'E') {
          e2[n - 1] = 1;
        } else { 
          w2[n - 1] = 1;
        }
      } else {
        if(s.charAt(i) == 'E') {
          e2[i] = e2[i + 1] + 1;
          w2[i] = w2[i + 1];
        } else {
          e2[i] = e2[i + 1];
          w2[i] = w2[i + 1] + 1;
        }
      }
    }
    int ans = n;
    for(int k = 0; k < n; k++) {
      if(k == 0) {
        ans = Math.min(ans, e2[1]);
      } else if(k == (n - 1)) {
        ans = Math.min(ans, w1[n - 2]);
      } else {
        ans = Math.min(ans, w1[k - 1] + e2[k + 1]);
      }
    }
    System.out.println(ans);
  }
}
