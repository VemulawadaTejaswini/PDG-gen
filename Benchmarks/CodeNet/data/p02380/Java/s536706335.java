import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double deg = sc.nextDouble();
        double rad = Math.toRadians(deg);
        
        double s = 0;
        double l = 0;
        double hb = 0;
        double ha = 0;
        
        ha = b * Math.sin(rad);
        hb = a * Math.sin(rad);
        s = b * hb / 2;
        l = a + b + Math.hypot(hb, (b - a * Math.cos(rad)));
        
        System.out.println(s);
        System.out.println(l);
        System.out.println(ha);
    }
}
