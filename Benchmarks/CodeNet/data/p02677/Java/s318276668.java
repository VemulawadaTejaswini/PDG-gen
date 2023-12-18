import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    
    double ten_a = h*30 + m*0.5;
    double ten_b = m*6;
    
    double ax = Math.cos(Math.toRadians(ten_a)) * a;
    double ay = Math.sin(Math.toRadians(ten_a)) * a;
    
    double bx = Math.cos(Math.toRadians(ten_b)) * b;
    double by = Math.sin(Math.toRadians(ten_b)) * b;
    
    double ans = (Math.sqrt(Math.pow((ax-bx), 2) + Math.pow((ay-by), 2)));

    System.out.println(ans);
    
  }
}