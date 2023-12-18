import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      List<String> ns = new ArrayList<String>();
      for (int ii = 0; ii < n; ii++) {
        int k = scanner.nextInt();
        double h = scanner.nextDouble() / 100;
        double w = scanner.nextDouble();
        ns.add(String.format("%f,%07d", Math.abs(22 - (w / (h * h))), k));
      }
      Collections.sort(ns);
      String[] top = ns.get(0).split(",");
      System.out.println(Integer.parseInt(top[1]));
    }

  }
}