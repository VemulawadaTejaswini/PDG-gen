import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();
    double xShort;
    double yShort;
    double angleShort = (30) * H; // 360 ÷ 12
    double xLong;
    double yLong;
    double angleLong = (6) * M; // 360 ÷ 60;

    xShort = A * Math.cos(Math.toRadians(angleShort));
    yShort = A * Math.sin(Math.toRadians(angleShort));
    xLong = B * Math.cos(Math.toRadians(angleLong));
    yLong = B * Math.sin(Math.toRadians(angleLong));

    System.out.println(Math.sqrt(Math.pow(xShort - xLong, 2) + Math.pow(yShort - yLong, 2)));
  }
}
