import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int A,B,H,M;
      int i = 0;
      String an = scan.nextLine();
      String atai[] = an.split(" ",0);
      int num[] = new int[4];
      while(i < 4){
        num[i] = Integer.parseInt(atai[i]);
        i++;
      }
      A = num[0];
      B = num[1];
      H = num[2];
      M = num[3];
//      System.out.println(A+","+B+","+H+","+M);
      check(A,B,H,M);
        scan.close();
    }
  
  public static void check(int a,int b,int h,int m){
   double ang;
   double result,c; 
    ang = ((30*h + 0.5*m) - 6*m);
    ang = Math.abs(ang);
//    System.out.println(ang);
    if(ang == 180){
      result = a+b;
      System.out.println(result);
      return;
    }else if(ang > 180){
      ang = 360 -ang;
//      System.out.println(ang);
    }
    ang = Math.toRadians(ang);
    c = a*a + b*b - 2*a*b*Math.cos(ang);
    result = Math.sqrt(c);
    System.out.println(result);
    return;
  }
}