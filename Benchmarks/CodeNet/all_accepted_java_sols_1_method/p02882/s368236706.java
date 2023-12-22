import java.util.*;

public class Main{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    
    double tan;
    
	double temp = (double) a*a*b/2.0d;
    
    if (x <= temp) {
      tan = (double)a*b*b/(2.0d*x);
    } else {
      tan = (double)2.0d*(a*a*b-x)/(a*a*a);
    }
    
    double result = Math.toDegrees(Math.atan(tan));
    
    System.out.println(result);
    
  }
}