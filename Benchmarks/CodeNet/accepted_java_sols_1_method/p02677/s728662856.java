import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double rads = 2.0 * Math.PI * ((double)m / 60.0);
    double radl = (Math.PI / 6) * h + (Math.PI / 6.0) * ((double)m / 60.0);
    double rad = 0.0;
    if (Math.abs(rads- radl) < Math.PI)
    	rad = Math.abs(rads - radl);
    else
      	rad = 2.0 * Math.PI - Math.abs(rads - radl);
    double c = Math.sqrt(a*a + b*b - 2.0*a*b*Math.cos(rad));

    System.out.println(c);
  }
}
      