import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flg = true;

    while(flg) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      if (x <= 0 && y <= 0) {
        System.exit(0);
      }

      if (x > y) {
        System.out.println(y + " " + x);
      } else if (x < y) {
        System.out.println(x + " " + y);
      } else {
        System.out.println(x + " " + y);
      }
    }
    sc.close();

  }
}
