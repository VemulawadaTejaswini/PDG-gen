import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int width, height, point_x, point_y, r;
    width = Integer.parseInt(sc.next());
    height = Integer.parseInt(sc.next());
    point_x = Integer.parseInt(sc.next());
    point_y = Integer.parseInt(sc.next());
    r = Integer.parseInt(sc.next());
    if((0 <= point_x - r && point_x + r <= width) && (0 <= point_y - r && point_y + r <= height)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
