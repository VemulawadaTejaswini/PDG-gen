import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.printf("%.8f %.8f\n",r*r*Math.PI,2*r*Math.PI);
    }
}
