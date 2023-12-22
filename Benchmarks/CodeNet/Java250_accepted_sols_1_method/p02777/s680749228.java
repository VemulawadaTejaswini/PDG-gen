import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.next();
    int c = a;
    int d = b;

    if (s.equals(u)) {
      c = a - 1;
    } else if (t.equals(u)) {
      d = b - 1;
    }
    System.out.println(c + " " + d);
  }
}