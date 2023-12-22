import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int h=scn.nextInt();
        int m=scn.nextInt();
        double a_angle=h*(360/12)+m*0.5;
        double b_angle=m*(360/60);
        double c=a_angle-b_angle;
        if(c<0) c+=360;
        
        System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c))));
    }
}
