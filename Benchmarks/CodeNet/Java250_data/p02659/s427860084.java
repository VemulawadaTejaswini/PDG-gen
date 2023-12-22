import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  final static int max = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int i = 0;
      String N;     
        long A = scan.nextLong();
        double B = scan.nextDouble();
     //   System.out.println(a[i]);
        cal(A,B);
        scan.close();
    }
  
  public static void cal(long a,double b){
     long s = 0;
     long bb;
    bb = Math.round(b*100);
     s = a*bb/100;
     System.out.println(s);
  }
}