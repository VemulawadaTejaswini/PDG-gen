import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int t = sc.nextInt();
    //while (t-- > 0) {
    int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
    int tmp = y;
    y = x;
    x = z;
    z = tmp;
    System.out.println(x + " " + y + " " + z);
    //}
  }
}