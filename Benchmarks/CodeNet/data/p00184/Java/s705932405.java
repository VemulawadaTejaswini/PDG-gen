import java.util.*;

class Main {
  public static void main (String[] args) {
    int[] ages = {10, 20, 30, 40, 50, 60, -1};
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int[] as = new int[7];
      for (int ii = 0; ii < n; ii++) {
        int a = scanner.nextInt();
        for (int jj = 0; jj < 7; jj++) {
          if (jj == 6) {
            as[6]++;
            break;
          }
          if (a < ages[jj]) {
            as[jj]++;
            break;
          }
        }
      }
      for (int ii = 0; ii < 7; ii++) {
        System.out.println(as[ii]);
      }
    }
  }
}