import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    sc.close();

    double ans = 0;

    double hDegrees = 30 * h + m / 2.0;
    double mDegrees = 6 * m;
    double inDegrees = Math.abs(hDegrees - mDegrees);
    if (inDegrees > 180) {
      inDegrees = 360 - inDegrees;
    }
    double inRadians = Math.toRadians(inDegrees);

    double sine = Math.sin(inRadians);
    double cosine = Math.cos(inRadians);


    ans = Math.sqrt(Math.pow(b * sine, 2) + Math.pow(b * cosine - a, 2));

    System.out.println(ans);
  }
}
