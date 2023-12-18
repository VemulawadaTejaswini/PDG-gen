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
    double degreeShort = 90 - (30 * H) - (30 * M / 60); // 時針は分針のぶんもちょっぴり動く
    double xLong;
    double yLong;
    double degreeLong = 90 - (6 * M);

    double radianShort = degreeShort * Math.PI / 180;
    yShort = Math.sin(radianShort) * A;
    xShort = Math.cos(radianShort) * A;

    double radianLong = degreeLong * Math.PI / 180;
    yLong = Math.sin(radianLong) * B;
    xLong = Math.cos(radianLong) * B;

    double distance =
        Math.sqrt((xLong - xShort) * (xLong - xShort) + (yLong - yShort) * (yLong - yShort));
    System.out.println(distance);
  }
}
