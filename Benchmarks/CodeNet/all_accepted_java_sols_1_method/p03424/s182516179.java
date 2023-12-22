import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = "";
    
    int p = 0;
    int w = 0;
    int g = 0;
    int y = 0;
    
    for (int i = 0; i < n; i++) {
      s = sc.next();
      
      if (s.equals("P") && p == 0) {
        p = 1;
      } else if (s.equals("W") && w == 0) {
        w = 1;
      } else if (s.equals("G") && g == 0) {
        g = 1;
      } else if (s.equals("Y") && y == 0) {
        y = 1;
      }
    }
    
    System.out.println((p + w + g + y) == 3 ? "Three" : "Four");
  }
}