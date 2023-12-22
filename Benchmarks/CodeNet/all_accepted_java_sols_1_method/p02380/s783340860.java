import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double s = a * b * Math.sin(Math.PI * c / 180) / 2;
    double l = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.PI * c / 180)) + a + b;
    double h = 2 * s / a;

    System.out.println(s);
    System.out.println(l);
    System.out.println(h);
  }
}

