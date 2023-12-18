import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble(),b = scan.nextDouble(),c = scan.nextDouble();
    out.printf("%.5f\n%.5f\n%.5f\n",a*b*sin(c*PI/180)*0.5,a+b+sqrt(a*a+b*b-2*a*b*cos(c*PI/180)),b*sin(c*PI/180));
  }
}