import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = -256; i < 256; i++) {
      for (int j = -256; j < 256; j++) {
        long a = i;
        long b = j;
        // System.out.println(Math.pow(a, 5) + Math.pow(b, 5));/

        if (Math.pow(a, 5) - Math.pow(b, 5) == (long) n) {
          System.out.println(a + " " + b);
          return;
        }

      }
    }
  }
}