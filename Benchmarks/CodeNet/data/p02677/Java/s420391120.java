import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double H = sc.nextDouble();
    double M = sc.nextDouble();

    double degA = (H * 30d) + (M / 60d * 30d);
    double degB = M * 6d;

    double deg = Math.abs(degA - degB) % 180d;
    double rad = deg * ( Math.PI / 180d );

    double height = A * Math.sin(rad);
    double width  = Math.abs(B - A * Math.cos(rad));

    double ans = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    System.out.println(ans);
  }
}
