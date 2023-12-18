import java.util.Scanner;
import java.util.Stack;

public class Main {
  static int[][] numbers;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    long x= in.nextLong();
    long k = in.nextLong();
    long d = in.nextLong();

    x = Math.abs(x);
    if(x>0 && (x/d)>=k) {
       long q = x/d;
       x = x-(k)*d;

    } else {
      long y = x/d;
      x =x -(y)*d;
      k -=y;
      if(k%2==0)
        x= Math.abs(x);
      else
        x = Math.min(Math.abs(x-d),Math.abs(x+d));
    }

    System.out.println(x);     
  }
  
  
}
