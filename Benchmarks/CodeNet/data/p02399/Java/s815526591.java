import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = Double.parseDouble(sc.next()) * 1.00000;
    double b = Double.parseDouble(sc.next()) * 1.00000;
    int i = (int) a;
    int j = (int) b;
    int d = i / j;
    int r = i % j;
    double f = a / b;
    System.out.println(d + " " + r + " " + f);
  }
}

