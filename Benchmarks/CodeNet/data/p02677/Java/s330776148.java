import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double m_angle = 6.0 * m;
    double h_angle = (30.0 * h) + (0.5 * m);
    double mh_angle = Math.abs(h_angle - m_angle);
    //余弦定理
    double cc = (a * a) + (b * b) - 2 * a * b * Math.cos(Math.toRadians(mh_angle));
    System.out.println(Math.sqrt(cc));
  }
}