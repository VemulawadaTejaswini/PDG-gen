import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      int width = sc.nextInt();
      int height = sc.nextInt();

      int x = sc.nextInt();
      int y = sc.nextInt();
      int r = sc.nextInt();

      int maxWidth = x + r;
      int maxHeight = y + r;

      boolean isWidth = maxWidth > 0 ? true : false;
      boolean isHeight = maxHeight > 0 ? true : false;

      if (!isHeight || !isWidth) {
        System.out.println("No");
        System.exit(0);
      }

      if(width >= maxWidth && height >= maxHeight) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

      sc.close();
  }
}
