import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;
 
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
      double x[] = new double[4];
      double y[] = new double[4];
      for(int i=0;i<4;i++){
        x[i] = scan.nextDouble();
        y[i] = scan.nextDouble();
      }
      double a = (x[0] - x[1]) * (x[2] - x[3]);
      double b = (y[0] - y[1]) * (y[2] - y[3]);
      if((float)a + (float)b == 0) out.println("YES");
      else out.println("NO");
    }
  }
}
