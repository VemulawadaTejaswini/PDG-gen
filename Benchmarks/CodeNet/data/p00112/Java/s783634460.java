import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      List<Integer> m = new ArrayList<Integer>();
      for (int ii = 0; ii < n; ii++) {
        m.add(scanner.nextInt());
      }
      Collections.sort(m);
      int t = 0;
      for (int ii = 0; ii < m.size() - 1; ii++) {
        t += m.get(ii) * (n - (ii + 1));
      }
      out += t + "\n";
    }
    System.out.print(out);
  }
}