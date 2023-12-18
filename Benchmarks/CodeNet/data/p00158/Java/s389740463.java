import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int ii = 0;
      for (; n != 1; ii++) {
        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = n * 3 + 1;
        }
      }
      System.out.println(ii);
    }
  }
}