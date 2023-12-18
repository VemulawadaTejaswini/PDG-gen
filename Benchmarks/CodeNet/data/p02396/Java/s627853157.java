import java.util.*;

public class Main {
  public static void Main() {
    Scanner sc = new Scanner(System.in);
    int n = 1;
    int x = sc.nextInt();
    while (x != 0) {
      System.out.println("Case " + n + ": " + x);
      n++;
      x = sc.nextInt();
    }
  }
}
  
        