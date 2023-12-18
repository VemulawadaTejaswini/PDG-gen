import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n + 1];
    int[] b = new int[m + 1];

    a[0] = 0;
    for (int cnt = 1; cnt <= n; cnt++) {
      a[cnt] = a[cnt - 1] + sc.nextInt();
    }

    b[0] = 0;
    for (int cnt = 1; cnt <= m; cnt++) {
      b[cnt] = b[cnt - 1] + sc.nextInt();
    }

    int nextBStart = 0;
    for (int acnt = 0; acnt <= n; acnt++) {
      int tmpAns = 0;
      if (a[acnt] > k) {
        break;
      }
      for (int bcnt = nextBStart; bcnt <= m; bcnt++) {
        nextBStart = bcnt;
        if (a[acnt] + b[bcnt] > k) {
          break;
        }
        tmpAns = acnt + bcnt + 2;
      }
      ans = Math.max(tmpAns, ans);
    }
    System.out.println(ans);
    sc.close();
  }
}
