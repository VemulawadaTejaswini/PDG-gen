import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int c0 = 0;
      int c1 = 0;
      int c2 = 0;
      int c3 = 0;
      int c4 = 0;
      int c5 = 0;
      int c6 = 0;
      for (int ii = 0; ii < n; ii++) {
        int a = scanner.nextInt();
        if (a < 10) {
          c0++;
        } else if (a < 20) {
          c1++;
        } else if (a < 30) {
          c2++;
        } else if (a < 40) {
          c3++;
        } else if (a < 50) {
          c4++;
        } else if (a < 60) {
          c5++;
        } else {
          c6++;
        }
      }
      System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n", c0, c1, c2, c3, c4, c5, c6);
    }
  }
}