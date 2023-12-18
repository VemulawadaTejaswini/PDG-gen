import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cntA = 0;
    int cntB = 0;
    int time = 0;
    int ans = 0;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n + 1];
    int[] b = new int[m + 1];
    for (int cnt = 0; cnt < n; cnt++) {
      a[cnt] = sc.nextInt();
    }
    a[n] = 0;
    for (int cnt = 0; cnt < m; cnt++) {
      b[cnt] = sc.nextInt();
    }
    b[m] = 0;

    for (int cnt = 0; cnt < (int) Math.pow(2, n + m); cnt++) {
      cntA = 0;
      cntB = 0;
      time = 0;
      for (int j = 0; j < (n + m) + 1; j++) {
        if (j == (n + m)) {
          ans = n + m;
          break;
        }
        if (cntA < n && a[cntA] < b[cntB]) {
          time += a[cntA];
          cntA++;
        } else {
          time += b[cntB];
          cntB++;
        }
        if (time > k) {
          ans = Math.max(j, ans);
          break;
        }
      }
    }
    System.out.println(ans + "");
    sc.close();
  }
}