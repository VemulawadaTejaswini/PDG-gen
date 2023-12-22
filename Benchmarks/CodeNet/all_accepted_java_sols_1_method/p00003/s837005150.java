import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    String out = "";
    for (int ii = 0; ii < c; ii++) {
      int[] a = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
      java.util.Arrays.sort(a);
      if (a[0] * a[0] + a[1] * a[1] == a[2] * a[2]) {
        out += "YES\n";
      } else {
        out += "NO\n";
      }
    }
    System.out.print(out);
  }
}