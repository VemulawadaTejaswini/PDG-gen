import java.util.*;

public class Main { 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double a=sc.nextDouble();
      double b=sc.nextDouble();
      double x=sc.nextDouble();
      double o;
      if(x>a*a*b/2){
        double k=x/Math.pow(a,2);
        double l=2/a;
      	double tan=l*(b-k);
        o=Math.toDegrees(Math.atan(tan));
      }else{
      	double tan=a*Math.pow(b,2)/(2*x);
        o=Math.toDegrees(Math.atan(tan));
      }
      
      System.out.println(o);
    }
}