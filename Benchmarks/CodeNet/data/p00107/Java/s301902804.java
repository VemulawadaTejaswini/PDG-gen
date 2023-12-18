import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int l = scanner.nextInt();
      int w = scanner.nextInt();
      int h = scanner.nextInt();
      if (l == 0 && w == 0 && h == 0) {
        break;
      }
      int n = scanner.nextInt();
      for (int ii = 0; ii < n; ii++) {
        int r = scanner.nextInt();
        double a = r / Math.sqrt(2) * 2;
        int cnt = 0;
        if (l > a) {
          cnt++;
        }
        if (w > a) {
          cnt++;
        }
        if (h > a) {
          cnt++;
        }
        out += cnt >= 2 ? "OK\n" : "NA\n";
      }
    }
    System.out.println(out);
  }
}