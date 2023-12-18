import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner num = num Scanner(System.in);
    double r = num.nextDouble();
    double pi = Math.Pi;
    double area = r * r * pi;
    double length = 2 * r * pi;
    System.out.printf("%lf %lf",area,length);
  }
}