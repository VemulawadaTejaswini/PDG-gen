import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int e = sc.nextInt();
      int f = sc.nextInt();

      calcLinearEquation(a, b, c, d, e, f);
    }
  }

  static void calcLinearEquation(int a, int b, int c, int d, int e, int f) {
    double x = (b*f - c*e) / (double)(b*d - a*e);
    double y = (a*f - d*c) / (double)(a*e - b*d);

    System.out.printf("%.3f %.3f\n", x+0, y+0);
  }
}