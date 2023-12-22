import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int T = sc.nextInt();
    int mincost = 1001;

    for (int i = 0; i < n; i++) {
      int c = sc.nextInt();
      int t = sc.nextInt();
      if ((mincost > c) && (T >= t)) {
        mincost = c;
      }
    }

    if (mincost > 1000) {
      System.out.println("TLE");
    } else {
      System.out.println(mincost);
    }

  }
}