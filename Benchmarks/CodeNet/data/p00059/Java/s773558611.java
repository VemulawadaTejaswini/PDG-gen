import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double xa1 = scanner.nextDouble();
      double ya1 = scanner.nextDouble();
      double xa2 = scanner.nextDouble();
      double ya2 = scanner.nextDouble();
      double xb1 = scanner.nextDouble();
      double yb1 = scanner.nextDouble();
      double xb2 = scanner.nextDouble();
      double yb2 = scanner.nextDouble();
      if ((xa1 <= xb1 && xb1 <= xa2) || (xa1 <= xb2 && xb2 <= xa2) &&
          (ya1 <= yb1 && yb1 <= ya2) || (ya1 <= yb2 && yb2 <= ya2)) {
        out += "YES\n";
      } else {
        out += "NO\n";
      }
    }
    System.out.print(out);
  }
}