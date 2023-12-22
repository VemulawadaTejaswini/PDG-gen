import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    
    int l = 0;
    int r = W;
    int b = 0;
    int t = H;
    
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      if (a == 1) {
        l = Math.max(l, x);
      } else if (a == 2) {
        r = Math.min(r, x);
      } else if (a == 3) {
        b = Math.max(b, y);
      } else { // a == 4
        t = Math.min(t, y);
      }
    }
    int w = Math.max(r-l, 0);
    int h = Math.max(t-b, 0);
    
    System.out.println(w*h);
  }
}