import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double v = scanner.nextDouble();
      for (int n = 1; ; n++) {
        double vv = 9.8 * Math.sqrt((5 * n - 5) / 4.9);
        if (vv >= v) {
          out = n + "\n";
          break;
        }
      }
    }
  System.out.print(out);
  }
}