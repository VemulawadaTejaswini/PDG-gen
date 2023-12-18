import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    while (scanner.hasNext()) {
      double x = scanner.nextDouble();
      double h = scanner.nextDouble();
      out += Math.sqrt((x / 2) * (x / 2) + h * h) * x * 2 + x * x + "\n";
    }
    System.out.print(out);
  }
}