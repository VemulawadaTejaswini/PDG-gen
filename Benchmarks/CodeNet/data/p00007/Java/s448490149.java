import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    double s = 100;

    while (scanner.hasNext()) {
      int w = scanner.nextInt();
      for (int ii = 0; ii < w; ii++) {
        s = Math.ceil(s * 1.05);
      }
      System.out.println((int)(s * 1000));
    }
  }
}