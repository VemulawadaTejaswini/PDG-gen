import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = Double.parseDouble(sc.next());
    double b = Double.parseDouble(sc.next());
    int i = (int) a;
    int j = (int) b;
    int d = i / j;
    int r = i % j;
    double f = a / b;
    String s = String.format("%.5f", f);
    System.out.println(d + " " + r + " " + s);
  }
}

