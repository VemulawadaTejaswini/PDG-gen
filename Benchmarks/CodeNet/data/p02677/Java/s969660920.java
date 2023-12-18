import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, h, m;
        a = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        m = sc.nextDouble();
        double angle = Math.min(Math.abs(h * 30 + m * 0.5 - m * 6), 360 - Math.abs(h * 30 - m * 6));
        double pi = angle / 180 * Math.PI;
      	double ans = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*b*a*Math.cos(Math.toRadians(angle)));
        System.out.println(String.format("%.12f", ans));
    }
}
