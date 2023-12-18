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
    double angleShort = 90 - (30 * H); // 360 ÷ 12
    double xLong;
    double yLong;
    double angleLong = 90 - (6 * M); // 360 ÷ 60;

    double radianShort = angleShort * Math.PI / 180;
    yShort = Math.sin(radianShort) * A;
    xShort = Math.cos(radianShort) * A;

    double radianLong = angleLong * Math.PI / 180;
    yLong = Math.sin(radianLong) * B;
    xLong = Math.cos(radianLong) * B;

    double distance =
        Math.sqrt((xLong - xShort) * (xLong - xShort) + (yLong - yShort) * (yLong - yShort));
    System.out.println(distance);
  }
}
