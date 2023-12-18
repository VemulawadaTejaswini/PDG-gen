import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  while(sc.hasNext()){
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();
  int f=sc.nextInt();
  double y=(c*d-f*a)/(b*d-e*a);
  double x=(c*e-f*b)/(a*e-d*b);
  System.out.printf("%5.3f",x);
  System.out.printf(" %5.3f\n",y);
   }
   }
}