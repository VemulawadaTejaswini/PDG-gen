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
    double degreeShort = (90 - (30 * H)) % 360;
    if (-180 <= degreeShort && degreeShort < 180) {
      degreeShort = 90 - (30 * H);
    } else {
      degreeShort = 180 + ((90 - (30 * H)) + 180);
    }

    double xLong;
    double yLong;
    double degreeLong = 90 - (6 * M) % 360;
    if (-180 <= degreeLong && degreeLong < 180) {
      degreeLong = 90 - (30 * M);
    } else {
      degreeLong = 180 + ((90 - (30 * M)) + 180);
    }

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
