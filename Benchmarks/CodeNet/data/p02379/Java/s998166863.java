import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {

    
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();//
        double x2 = sc.nextDouble();// 
        double y2 = sc.nextDouble();//
    
//protected double getDistance(double x1,double y1,double x2,double y2){
        double distance = Math.sqrt((x2-x1) * (x2-x1) + (y2 - y1) * (y2 -y1));
  //public static double distance(x1,y1,x2,y2);
  //      return (double)distance;
  //       System.out.println((double)distance);
             System.out.println(String.format("%.8f",distance));
//System.out.println(String.format("%.8f", a));
    }
}

