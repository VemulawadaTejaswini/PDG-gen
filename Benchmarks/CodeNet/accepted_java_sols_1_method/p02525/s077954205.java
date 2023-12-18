import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      double abe = 0.0,al = 0.0;
      int sum = 0,n = scan.nextInt();
      if( n == 0 ) break;
      int ary[] = new int[n];
      for(int i = 0;i < n;i++){
        ary[i] = scan.nextInt();
        sum += ary[i];
      }
      abe = (double)sum / n;
      for(int i=0;i<n;i++){
        al += ((ary[i] - abe) * (ary[i] - abe));
      }
      out.printf("%.5f\n",sqrt(al/n));
    }
  }
}