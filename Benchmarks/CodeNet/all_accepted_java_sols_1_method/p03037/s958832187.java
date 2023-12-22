import java.util.*;
 
class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int lMax = 0;
    int rMin = Integer.MAX_VALUE;
    for (int i = 0; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt() + 1;
      lMax = Math.max(lMax, l);
      rMin = Math.min(rMin, r);
    }
    if (rMin - lMax < 0) {
      System.out.println(0);
      System.exit(0);
    }
    System.out.println(rMin - lMax);
  }
}