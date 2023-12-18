import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      boolean flag = true;
      for (int ii = 0; ii < n; ii++) {
        int no = scanner.nextInt();
        double at = scanner.nextDouble();
        double cn = scanner.nextDouble();
        if (at * cn >= 1000000) {
          System.out.println(no);
          flag = false;
        }
      }
      if (flag) {
        System.out.println("NA");
      }
    }
  }
}