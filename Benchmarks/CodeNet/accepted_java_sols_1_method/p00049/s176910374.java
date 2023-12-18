import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int ab = 0;
    int o = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] p = line.split(",");
      if (p[1].equals("A")) {
        a++;
      } else if (p[1].equals("B")) {
        b++;
      } else if (p[1].equals("AB")) {
        ab++;
      } else if (p[1].equals("O")) {
        o++;
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(ab);
    System.out.println(o);
  }
}