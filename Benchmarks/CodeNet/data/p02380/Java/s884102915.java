import java.util.Scanner;
public class Main {

  public static double height(int a, double area) {
    return 2 * (area / a);
  }

  public static double area(int a, int b, double c, double perimeter) {
    double halfP = perimeter / 2;
    return Math.pow(halfP * (halfP - a) * (halfP - b) * (halfP - c), .5);
  }

  public static double perimeter(int a, int b, double c) {
    return a + b + c;
  }

  public static double missingLength(int a, int b, int C) {
    return Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - (2*a*b*Math.cos(Math.toRadians(C))), .5);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int C = s.nextInt();
    double c = missingLength(a, b, C);
    double perimeter = perimeter(a, b, c);
    double area = area(a, b, c, perimeter);
    double height = height(a, area);
    System.out.println(area);
    System.out.println(perimeter);
    System.out.println(height);
    s.close();
  }

}

