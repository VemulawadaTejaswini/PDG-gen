import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int[] za = new int[n];
      for (int ii = 0; ii < n; ii++) {
        za[ii] = scanner.nextInt();
      }
      int oo = 32;
      for (int t = 0, zac = 0; oo > 0; t++) {
        if (t % 2 == 0) {
          oo -= (oo - 1) % 5;
        } else {
          oo -= za[zac];
          zac++;
          if (zac >= za.length) {
            zac = 0;
          }
        }
        if (oo < 0) {
          oo = 0;
        }
        System.out.println(oo);
      }
    }
  }
}