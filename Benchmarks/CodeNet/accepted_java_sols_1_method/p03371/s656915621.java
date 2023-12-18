import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      long cost = 0;
      if(a + b >= c * 2) {
        int min = Math.min(x, y);
        cost = c * 2 * min;
        x -= min;
        y -= min;
      }
      cost += x * Math.min(a, c * 2);
      cost += y * Math.min(b, c * 2);
      
      System.out.println(cost);
  }
}