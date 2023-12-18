import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ex = x - a;
    for (int i = 0;; i++) {
      ex -= b;
      if (ex < b) break;
    }
    System.out.println(ex);
  }

}
