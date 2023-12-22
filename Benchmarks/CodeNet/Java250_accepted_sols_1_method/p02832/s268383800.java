import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      int now = 0;
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        if (now + 1 == a) {
          now = a;
        }
      }
      System.out.println(now == 0 ? -1 : n - now);
    } finally {
      sc.close();
    }
  }
}