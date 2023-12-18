import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = 0;
    int e = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] s = line.split(",");
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      int c = Integer.parseInt(s[2]);
      if (a == b && b == c) {
        continue;
      }
      if (a * a + b * b == c * c) {
        d++;
      } else {
        e++;
      }
    }
    System.out.println(d);
    System.out.println(e);
  }
}