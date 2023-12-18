package 甲子園問題;
import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  while(sc.hasNext()){
  double a=sc.nextInt();
  double b=sc.nextInt();
  double c=sc.nextInt();
  double d=sc.nextInt();
  double e=sc.nextInt();
  double f=sc.nextInt();
  double y=(c*d-f*a)/(b*d-e*a);
  double x=(c*e-f*b)/(a*e-d*b);
  System.out.printf("%.3f %.3f\n",x,y);
   }
   }
}