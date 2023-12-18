import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String out = "";
    for (int ii = 0; ii < n; ii++) {
      double x1 = scanner.nextDouble();
      double y1 = scanner.nextDouble();
      double x2 = scanner.nextDouble();
      double y2 = scanner.nextDouble();
      double x3 = scanner.nextDouble();
      double y3 = scanner.nextDouble();
      double x4 = scanner.nextDouble();
      double y4 = scanner.nextDouble();
      if ((y2 - y1) / (x2 - x1) != (y4 - y3) / (x4 - x3)) {
        out += "NO" + "\n";
      } else {
        out += "YES" + "\n";
      }
    }
    System.out.print(out);
  }
}