import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    long[] rk = new long[n];
    long[] gk = new long[n];
    long[] bk = new long[n];
    if(s.charAt(n - 1) == 'R') {
      rk[n - 1] = 1;
    } else if(s.charAt(n - 1) == 'G') {
      gk[n - 1] = 1;
    } else {
      bk[n - 1] = 1;
    }
    for(int i = n - 2; i >= 0; i--) {
      if(s.charAt(i) == 'R') {
        rk[i] = rk[i + 1] + 1;
        gk[i] = gk[i + 1];
        bk[i] = bk[i + 1];
      } else if(s.charAt(i) == 'G') {
        gk[i] = gk[i + 1] + 1;
        rk[i] = rk[i + 1];
        bk[i] = bk[i + 1];
      } else {
        bk[i] = bk[i + 1] + 1;
        rk[i] = rk[i + 1];
        gk[i] = gk[i + 1];
      }
    }
    long ans = 0;
    for(int i = 0; i < n - 2; i++) {
      for(int j = i + 1; j < n - 1; j++) {
        int k = j + (j - i);
        if((s.charAt(i) == 'R') && (s.charAt(j) == 'G')) {
          if(k < n) {
            if(s.charAt(k) == 'B') {
              ans += (bk[j + 1] - 1);
            } else {
              ans += bk[j + 1];
            }
          } else {
            ans += bk[j + 1];
          }
        }
        if((s.charAt(i) == 'R') && (s.charAt(j) == 'B')) {
          if(k < n) {
            if(s.charAt(k) == 'G') {
              ans += (gk[j + 1] - 1);
            } else {
              ans += gk[j + 1];
            }
          } else {
            ans += gk[j + 1];
          }
        }
        if((s.charAt(i) == 'G') && (s.charAt(j) == 'R')) {
          if(k < n) {
            if(s.charAt(k) == 'B') {
              ans += (bk[j + 1] - 1);
            } else {
              ans += bk[j + 1];
            }
          } else {
            ans += bk[j + 1];
          }
        }
        if((s.charAt(i) == 'G') && (s.charAt(j) == 'B')) {
          if(k < n) {
            if(s.charAt(k) == 'R') {
              ans += (rk[j + 1] - 1);
            } else {
              ans += rk[j + 1];
            }
          } else {
            ans += rk[j + 1];
          }
        }
        if((s.charAt(i) == 'B') && (s.charAt(j) == 'R')) {
          if(k < n) {
            if(s.charAt(k) == 'G') {
              ans += (gk[j + 1] - 1);
            } else {
              ans += gk[j + 1];
            }
          } else {
            ans += gk[j + 1];
          }
        }
        if((s.charAt(i) == 'B') && (s.charAt(j) == 'G')) {
          if(k < n) {
            if(s.charAt(k) == 'R') {
              ans += (rk[j + 1] - 1);
            } else {
              ans += rk[j + 1];
            }
          } else {
            ans += rk[j + 1];
          }
        } 
      }
    }
    System.out.println(ans);
  }
}