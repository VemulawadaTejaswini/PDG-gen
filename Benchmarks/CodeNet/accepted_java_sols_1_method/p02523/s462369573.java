import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double x1 = scan.nextDouble(),y1 = scan.nextDouble();
    double x2 = scan.nextDouble(),y2 = scan.nextDouble();
    out.printf("%.5f\n",sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
  }
}