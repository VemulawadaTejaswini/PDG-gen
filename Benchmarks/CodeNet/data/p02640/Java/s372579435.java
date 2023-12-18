import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x, y;
    x = s.nextInt();
    y = s.nextInt();
    System.out.println((4 * x - y) / 2 >= 0 ? "Yes" : "No");
  }
}
