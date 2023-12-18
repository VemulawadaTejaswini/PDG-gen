import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int w = sc.nextInt();
      int h = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int r = sc.nextInt();

      int left = x - r;
      int right = x + r;
      int top = y + r;
      int bottom = y - r;

      if (left < 0 || left > w || right < 0 || right > w || top < 0 || top > h || bottom < 0 || bottom > h) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }

      sc.close();
  }
}
