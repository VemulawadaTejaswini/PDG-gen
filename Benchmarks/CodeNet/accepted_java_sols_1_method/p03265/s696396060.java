import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int x3, y3, x4, y4;
    int x = x2 - x1;
    int y = y2 - y1;
    
    x4 = -y + x1;
    y4 = x + y1;
    x3 = x4 + x;
    y3 = y4 + y;
    
    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
  }
}