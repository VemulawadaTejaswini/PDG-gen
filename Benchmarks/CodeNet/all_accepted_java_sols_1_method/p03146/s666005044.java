import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int s = sc.nextInt();

    int a = s;
    for (int i=0; i<=1000000; i++) {
      if (a == 4 || a == 2 || a == 1) {
        System.out.println(i + 4);
        return;
      }
      if (a % 2 == 0) {
        a = a / 2;
      } else {
        a = 3 * a + 1;
      }
    }

  }

}