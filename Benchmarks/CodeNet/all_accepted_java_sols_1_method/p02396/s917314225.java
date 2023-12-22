import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = 9;
      for (int i = 1; x != 0; i++) {
        x = sc.nextInt();
        if (x == 0) {
          break;
        }
        System.out.println("Case " + i + ": " + x);
      }

      sc.close();
  }
}
