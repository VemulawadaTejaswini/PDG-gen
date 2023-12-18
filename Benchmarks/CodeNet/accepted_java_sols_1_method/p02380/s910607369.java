import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
    double b = in.nextDouble();
    int C    = in.nextInt();

    double S = 0.5 * a * b * Math.sin(Math.toRadians(C));
    double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
    double h = b * Math.sin(Math.toRadians(C));
    
    System.out.printf("%5.8f", S);
    System.out.println();
    System.out.printf("%5.8f", L);
    System.out.println();
    System.out.printf("%5.8f", h);
  }
}