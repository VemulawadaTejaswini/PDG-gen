import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aS = sc.nextInt();
    int bL = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();

    // 角度を求める
    int a = Math.abs(h * 5 - m);
    int b = a * 6;
    if (b > 180) {
      b = 360 - b;
    }
    double bx =  b  + 0.5 * m;

    // サインを求める
    double c = Math.cos(Math.toRadians(bx));

    System.out.println(Math.sqrt(Math.pow(aS,2) + Math.pow(bL,2) - (2 * aS * bL) * c));
  }
}