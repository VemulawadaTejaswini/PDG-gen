import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double o=0;
      	double a=sc.nextDouble();
        double b=sc.nextDouble();
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double d=6*y-(30*x+y/2);
        double cosin=Math.cos(Math.toRadians(d));
        o=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*cosin);
      System.out.println(o);
    }
    
}