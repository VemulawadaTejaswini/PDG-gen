import java.util.*;
import java.io.*;

class Main {
  int A, B, len;
  String S;
  char[] cS;
  boolean flg;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    S = sc.next();
    cS = S.toCharArray();
    len = cS.length;
  }

  public void solve() {
    if(len == A + B + 1) {
      if(cS[A] == '-') {
        for(int i = 0; i < A; i++) {
          if(cS[i] >= '0' && cS[i] <= '9') {
            flg = true;
          } else {
            flg = false;
            break;
          }
        }
        if(flg == true) {
          for(int i = A + 1; i < len; i++) {
            if(cS[i] >= '0' && cS[i] <= '9') {
              flg = true;
            } else {
              flg = false;
              break;
            }
          }
        }
      } else {
        flg = false;
      }
    } else {
      flg = false;
    }
  }

  public void out() {
    if(flg == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
