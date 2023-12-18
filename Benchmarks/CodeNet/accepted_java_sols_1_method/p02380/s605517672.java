import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = Math.toRadians(sc.nextInt());
    double s = 0.5 * a * b * Math.sin(c);
    double lengthC = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c));
    double l = a + b + lengthC;
    double h = b * Math.sin(c);
    System.out.println(s);
    System.out.println(l);
    System.out.println(h);
  }
}

