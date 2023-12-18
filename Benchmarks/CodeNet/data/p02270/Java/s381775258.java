/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_D&lang=jp
 */

import java.util.*;
import java.util.Arrays;


class Main {

  /*
  class Memo2 {
    int i, t;
    Memo2(int i, int t) {
      this.i = i;
      this.t = t;
    }
    public int hashCode() {
      return Objects.hash(i, t);
    }
    public boolean equals(Object o) {
      if (o instanceof Memo2) {
        Memo2 m = (Memo2) o;
        if (m.i == i && m.t == t) {
          return true;
        }
      }
      return false;
    }
  }
  */
  int n=0, k=0;
  int[] W;

  void printArray(int[] a) {
    System.out.print(a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print(" " + a[i]);
    }
  }

  //int[][] memo = new int[100001][100001];

  int solve2(int i, int t, int max) {
    if (i >= n) return 0;
    if (t == k-1) {
      int sum = 0;
      for (; i < n; i++) {
        sum += W[i];
      }
      return sum;
    }
    int sum = 0;
    int min = Integer.MAX_VALUE;
    sum += W[i];
    /*
    for (i+=1; i < n - (k-1-t); i++) {
      if (sum + W[i] >= max) break;
      sum += W[i];
    }*/
    for (; i < n - (k-1-t); i++) {
      min = Math.min(min, Math.max(sum, solve2(i+1, t+1, max)));
      sum += W[i+1];
      max = sum;
    }
    /*
    for (; i < n - (k-1-t); i++) {
      sum += W[i];
      min = Math.min(min, Math.max(sum, solve2(i+1, t+1, sum)));
    }
    */
    return min;
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    W = new int[n];
    //T = new int[k];
    for (int i = 0; i < n; i++) {
      W[i] = sc.nextInt();
    }

    //System.out.println(solve(0, 0, 0, 0));
    System.out.println(solve2(0, 0, 0));
  }
  static public void main(String[] args) {
    new Main().run();
  }
}
