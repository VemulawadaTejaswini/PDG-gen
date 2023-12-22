import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double d = 0;
        
        d = Math.hypot(Math.abs(x1 - x2), Math.abs(y1 - y2));
        System.out.println(d);
    }
}

