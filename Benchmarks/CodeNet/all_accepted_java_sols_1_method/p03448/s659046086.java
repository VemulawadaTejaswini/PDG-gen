import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();

    int am = Math.min (x / 500, a);
    int bm = Math.min (x / 100, b);
    
    int cnt = 0;
    for (int i = am; i >= 0; i--) {
      int n = x;
      if (n == 500 * i) cnt++;
      for (int j = bm; j >= 0; j--) {
        n = x - (500 * i);
        if (n > 0 && n == 100 * j) cnt++;
        n = x - (500 * i) - (100 * j);
        if (n > 0 && n <= 50 * c) cnt++;
      }
    }

    System.out.println(cnt);
  }
}