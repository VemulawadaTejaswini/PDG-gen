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
      out += xa1 <= xb1 && xb1 <= xa2 && ya1 <= yb2 && yb2 <= ya2 ? "YES\n" : "NO\n";
    }
    System.out.print(out);
  }
}