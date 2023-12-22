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
      boolean ok = true;
      if(x[0] > x[3]) ok = false;
      if(y[0] > y[3]) ok = false;
      if(x[2] > x[1]) ok = false;
      if(y[2] > y[1]) ok = false;
      if(ok) out.println("YES");
      else out.println("NO");
    }
  }
}