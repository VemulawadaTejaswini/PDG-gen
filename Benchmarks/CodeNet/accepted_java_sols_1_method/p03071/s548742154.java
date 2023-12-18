import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int a = s.nextInt();
    int b = s.nextInt();
    if (a != b) {
      System.out.println(Math.max(a, b) * 2 - 1);
    } else {
      System.out.println(2 * a);
      
    }
  }
}
