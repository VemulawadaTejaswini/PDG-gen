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
      if(sqrt((x[1]-x[0])*(x[3]-x[2]) + (y[1]-y[0])*(y[3]-y[2])) < 1e-12){
        out.println("YES");
      }else out.println("NO");
    }
  }
}